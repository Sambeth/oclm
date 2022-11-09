package com.sambeth.oclm

import com.sambeth.oclm.models.*
import com.sambeth.oclm.rules.treasures.*
import com.sambeth.oclm.rules.livingaschristians.*
import com.sambeth.oclm.rules.applyyourselftothefieldministry.*

object Main extends App {
  // testing some bits of logic here
  val simpleFemaleMember = SimpleFemaleMember(id=1, firstName = "Phyll", "Boat")
  val simpleMaleMember = SimpleMaleMember(id=1, firstName = "Sam", "Beth")

  val simpleFemaleMemberWhoIsAStudent = SimpleFemaleMemberWhoIsAStudent(id = 1, firstName = "Phyllis", lastName = "Boakye")
  val simpleMaleMemberWhoIsAStudent = SimpleMaleMemberWhoIsAStudent(id = 2, firstName = "Alex", lastName = "Booth")

  val unbaptizedFemalePublisher = UnbaptizedFemalePublisher(id = 3, firstName = "Abs", lastName = "Nuh")
  val unbaptizedMalePublisher = UnbaptizedMalePublisher(id = 4, firstName = "Ed", lastName = "Ab")

  val simpleBaptizedFemalePublisher = SimpleBaptizedFemalePublisher(id = 5, firstName = "Icon", lastName = "Run")
  val simpleBaptizedMalePublisher = SimpleBaptizedMalePublisher(id = 6, firstName = "Ana", lastName = "Kin")

  val femalePioneer = FemalePioneer(id = 7, firstName = "Bab", lastName = "Tin")
  val malePioneer = MalePioneer(id = 8, firstName = "Alloy", lastName = "Sius")

  val ministerialServant = MinisterialServant(id = 9, firstName = "Cite", lastName = "Man")
  val elder = Elder(id = 10, firstName = "All", lastName = "In")

  println(simpleFemaleMemberWhoIsAStudent)
}
