package com.sambeth.oclm

import com.sambeth.oclm.models._
import com.sambeth.oclm.rules.treasures.TreasuresImplicits._
import com.sambeth.oclm.rules.livingaschristians.LivingAsChristiansImplicits._
import com.sambeth.oclm.rules.applyyourselftothefieldministry.ApplyYourselfToTheFieldMinistryImplicits._

import org.apache.spark.sql.SparkSession


object Main extends App {

  // start spark session
  val spark = SparkSession
    .builder()
    .appName("OCLM")
    .config("spark.master", "local")
    .getOrCreate()

  import spark.implicits._

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
  ).as[SimpleFemaleMemberWhoIsAStudent]

  val unbaptizedFemalePublishers = spark.sql(
    s"SELECT $neededColumns FROM females WHERE student = 'Yes' AND publisher = 'Yes' AND baptized = 'No'"
  ).as[UnbaptizedFemalePublisher]

  val simpleBaptizedFemalePublishers = spark.sql(
    s"SELECT $neededColumns FROM females WHERE student = 'Yes' AND publisher = 'Yes' AND baptized = 'Yes' AND pioneer = 'No'"
  ).as[SimpleBaptizedFemalePublisher]

  val femalePioneers = spark.sql(
    s"SELECT $neededColumns FROM females WHERE pioneer = 'Yes'"
  ).as[FemalePioneer]

  // filter only those available
  private val males = spark.sql(
    "SELECT * FROM availableBatch WHERE gender = 'Male'"
  ).createOrReplaceTempView("males")

  val simpleMaleMembersWhoAreStudents = spark.sql(
    s"SELECT $neededColumns FROM males WHERE student = 'Yes' AND publisher = 'No'"
  ).as[SimpleMaleMemberWhoIsAStudent]

  val unbaptizedMalePublishers = spark.sql(
    s"SELECT $neededColumns FROM males WHERE student = 'Yes' AND publisher = 'Yes' AND baptized = 'No'"
  ).as[UnbaptizedMalePublisher]

  val simpleBaptizedMalePublishers = spark.sql(
    s"SELECT $neededColumns FROM males WHERE student = 'Yes' AND publisher = 'Yes' AND baptized = 'Yes' AND pioneer = 'No'"
  ).as[SimpleBaptizedMalePublisher]

  val malePioneers = spark.sql(
    s"SELECT $neededColumns FROM males WHERE pioneer = 'Yes'"
  ).as[MalePioneer]

  val ministerialServants = spark.sql(
    s"SELECT $neededColumns FROM males WHERE ministerialServant = 'Yes'"
  ).as[MinisterialServant]

  val elders = spark.sql(
    s"SELECT $neededColumns FROM males WHERE elder = 'Yes'"
  ).as[Elder]


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

}
