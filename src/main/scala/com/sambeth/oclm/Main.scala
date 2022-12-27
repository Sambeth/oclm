package com.sambeth.oclm

import com.sambeth.oclm.models.*
import com.sambeth.oclm.rules.treasures.given
import com.sambeth.oclm.rules.livingaschristians.given
import com.sambeth.oclm.rules.applyyourselftothefieldministry.given

import org.apache.spark.sql.SparkSession

object Main extends App {

  // start spark session
  val spark = SparkSession
    .builder()
    .appName("OCLM")
    .config("spark.master", "local")
    .getOrCreate()

  // read csv
  private val membersDf = spark
    .read
    .option("header", "true")
    .csv("C:\\Users\\sambe\\Documents\\projects\\oclm\\src\\main\\resources\\Cong Members _ OCLM - Members.csv")
    .createOrReplaceTempView("membersDf")

  // filter only those available
  private val availableBatch = spark.sql(
    "SELECT * FROM membersDf WHERE availability = 'Yes'"
  ).createOrReplaceTempView("availableBatch")

  private val neededColumns = "id, firstName, lastName"

  private val females = spark.sql(
    "SELECT * FROM availableBatch WHERE gender = 'Female'"
  ).createOrReplaceTempView("females")

  val simpleFemaleMembersWhoAreStudents = spark.sql(
    s"SELECT $neededColumns FROM females WHERE student = 'Yes' AND publisher = 'No'"
  )

  val unbaptizedFemalePublishers = spark.sql(
    s"SELECT $neededColumns FROM females WHERE student = 'Yes' AND publisher = 'Yes' AND baptized = 'No'"
  )

  val simpleBaptizedFemalePublishers = spark.sql(
    s"SELECT $neededColumns FROM females WHERE student = 'Yes' AND publisher = 'Yes' AND baptized = 'Yes' AND pioneer = 'No'"
  )

  val femalePioneers = spark.sql(
    s"SELECT $neededColumns FROM females WHERE pioneer = 'Yes'"
  )

  // filter only those available
  private val males = spark.sql(
    "SELECT * FROM availableBatch WHERE gender = 'Male'"
  ).createOrReplaceTempView("males")

  val simpleMaleMembersWhoAreStudents = spark.sql(
    s"SELECT $neededColumns FROM males WHERE student = 'Yes' AND publisher = 'No'"
  )

  val unbaptizedMalePublishers = spark.sql(
    s"SELECT $neededColumns FROM males WHERE student = 'Yes' AND publisher = 'Yes' AND baptized = 'No'"
  )

  val simpleBaptizedMalePublishers = spark.sql(
    s"SELECT $neededColumns FROM males WHERE student = 'Yes' AND publisher = 'Yes' AND baptized = 'Yes' AND pioneer = 'No'"
  )

  val malePioneers = spark.sql(
    s"SELECT $neededColumns FROM males WHERE pioneer = 'Yes'"
  )

  val ministerialServants = spark.sql(
    s"SELECT $neededColumns FROM males WHERE ministerialServant = 'Yes'"
  )

  val elders = spark.sql(
    s"SELECT $neededColumns FROM males WHERE elder = 'Yes'"
  )

  ministerialServants.show(10)
  elders.show(10)

  // testing some bits of logic here
//  val simpleFeMaleMember = SimpleFemaleMember(id=1, firstName = "Phyll", "Boat")
//  val simpleMaleMember = SimpleMaleMember(id=1, firstName = "Sam", "Beth")
//
//  val simpleFemaleMemberWhoIsAStudent = SimpleFemaleMemberWhoIsAStudent(id = 1, firstName = "Phyllis", lastName = "Boakye")
//  val simpleMaleMemberWhoIsAStudent = SimpleMaleMemberWhoIsAStudent(id = 2, firstName = "Alex", lastName = "Booth")
//
//  val unbaptizedFemalePublisher = UnbaptizedFemalePublisher(id = 3, firstName = "Abs", lastName = "Nuh")
//  val unbaptizedMalePublisher = UnbaptizedMalePublisher(id = 4, firstName = "Ed", lastName = "Ab")
//
//  val simpleBaptizedFemalePublisher = SimpleBaptizedFemalePublisher(id = 5, firstName = "Icon", lastName = "Run")
//  val simpleBaptizedMalePublisher = SimpleBaptizedMalePublisher(id = 6, firstName = "Ana", lastName = "Kin")
//
//  val femalePioneer = FemalePioneer(id = 7, firstName = "Bab", lastName = "Tin")
//  val malePioneer = MalePioneer(id = 8, firstName = "Alloy", lastName = "Sius")
//
//  val ministerialServant1 = MinisterialServant(id = 9, firstName = "Cite", lastName = "Man")
//  val ministerialServant2 = MinisterialServant(id = 10, firstName = "Ant", lastName = "Man")
//  val elder1 = Elder(id = 11, firstName = "All", lastName = "In")
//  val elder2 = Elder(id = 12, firstName = "Half", lastName = "Out")
//
//  val chairman = Chairman(elder2)
//
//  val oclmScheduleMapperTemplate: Map[String, Map[String, Option[Assignment]]] = Map(
//    "Others" -> Map(
//      "Chairmanship" -> None,
//      "OpeningPrayer" -> None,
//      "ClosingPrayer" -> None
//    ),
//    "TreasuresFromGodsWord" -> Map(
//      "TenMinutesTalk" -> None,
//      "SpiritualGems" -> None,
//      "BibleReading" -> None
//    ),
//    "ApplyYourselfToFieldMinistry" -> Map(
//      "InitialCallVideo" -> None,
//      "InitialCall" -> None,
//      "ReturnVisit" -> None,
//      "BibleStudy" -> None
//    ),
//    "LivingAsChristians" -> Map(
//      "LocalNeeds" -> None,
//      "CongregationBibleStudy" -> None
//    )
//  )
//
//  println(femalePioneer.copy(recency=25))
//  println(ministerialServant1.assignSpiritualGems)
}
