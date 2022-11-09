package com.sambeth.oclm.models

enum Status:
  case Active, Inactive

sealed trait Gender
trait Male extends Gender
trait Female extends Gender

sealed trait Potential
sealed trait Student extends Potential:
  def score: Option[Int] = None

sealed trait NonStudent extends Potential

// entities
transparent trait Member[G <: Gender, P <: Potential] {
  def id: Int
  def firstName: String
  def lastName: String
//  def fullName: String = s"$firstName $otherNames $lastName"
  def otherNames: Option[String] = None
  def age: Option[Int] = None
  def status: Option[Status] = None
}

case class SimpleFemaleMember(id: Int, firstName: String, lastName: String) extends Member[Female, NonStudent]
case class SimpleMaleMember(id: Int, firstName: String, lastName: String) extends Member[Male, NonStudent]

case class SimpleFemaleMemberWhoIsAStudent(id: Int, firstName: String, lastName: String) extends Member[Female, Student]
case class SimpleMaleMemberWhoIsAStudent(id: Int, firstName: String, lastName: String) extends Member[Male, Student]

sealed trait FemalePublisher extends Member[Female, Student]
sealed trait MalePublisher extends Member[Male, Student]

case class UnbaptizedFemalePublisher(id: Int, firstName: String, lastName: String) extends FemalePublisher
case class UnbaptizedMalePublisher(id: Int, firstName: String, lastName: String) extends MalePublisher
trait BaptizedFemalePublisher extends FemalePublisher
trait BaptizedMalePublisher extends MalePublisher

case class SimpleBaptizedFemalePublisher(id: Int, firstName: String, lastName: String) extends BaptizedFemalePublisher
case class SimpleBaptizedMalePublisher(id: Int, firstName: String, lastName: String) extends BaptizedMalePublisher

case class FemalePioneer(id: Int, firstName: String, lastName: String) extends BaptizedFemalePublisher
case class MalePioneer(id: Int, firstName: String, lastName: String) extends BaptizedMalePublisher

case class MinisterialServant(id: Int, firstName: String, lastName: String) extends BaptizedMalePublisher with Member[Male, Student]
case class Elder(id: Int, firstName: String, lastName: String) extends BaptizedMalePublisher with Member[Male, Student]


// oclm assignments
trait Assignment

trait TreasuresFromGodsWord extends Assignment
trait TenMinutesTalk extends TreasuresFromGodsWord
trait SpiritualGems extends TreasuresFromGodsWord
trait BibleReading extends TreasuresFromGodsWord

trait ApplyYourselfToFieldMinistry extends Assignment
trait InitialCallVideo extends ApplyYourselfToFieldMinistry
trait InitialCall extends ApplyYourselfToFieldMinistry
trait ReturnVisitVideo extends ApplyYourselfToFieldMinistry
trait ReturnVisit extends ApplyYourselfToFieldMinistry
trait BibleStudy extends ApplyYourselfToFieldMinistry
trait FiveMinTalk extends ApplyYourselfToFieldMinistry

trait LivingAsChristians extends Assignment
trait AdHoc(title: String) extends LivingAsChristians
trait CongregationBibleStudy extends LivingAsChristians