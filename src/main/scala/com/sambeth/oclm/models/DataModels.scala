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

//sealed trait Publisher:
//  this: Student =>

// entities
transparent trait Member[Gender, Potential] {
  def id: Int
  def firstName: String
  def lastName: String
//  def fullName: String = s"$firstName $otherNames $lastName"
  def otherNames: Option[String] = None
  def age: Option[Int] = None
  def status: Option[Status] = None
}

// female
abstract case class SimpleFemaleMember(id: Int, firstName: String, lastName: String) extends Member[Female, NonStudent]
abstract case class SimpleFemaleMemberWhoIsAStudent(id: Int, firstName: String, lastName: String) extends Member[Female, Student]
sealed trait FemalePublisher extends Member[Female, Student]
case class UnbaptizedFemalePublisher(id: Int, firstName: String, lastName: String) extends FemalePublisher
trait BaptizedFemalePublisher extends FemalePublisher
case class SimpleFemaleBaptizedPublisher(id: Int, firstName: String, lastName: String) extends BaptizedFemalePublisher
case class FemalePioneer(id: Int, firstName: String, lastName: String) extends BaptizedFemalePublisher

// male
abstract case class SimpleMaleMember(firstName: String, lastName: String) extends Member[Male, NonStudent]
abstract case class SimpleMaleMemberWhoIsAStudent(firstName: String, lastName: String) extends Member[Male, Student]
sealed trait MalePublisher extends Member[Male, Student]
abstract case class UnbaptizedMalePublisher(firstName: String, lastName: String) extends MalePublisher
trait BaptizedMalePublisher extends MalePublisher
case class SimpleMaleBaptizedPublisher(id: Int, firstName: String, lastName: String) extends BaptizedMalePublisher
case class MalePioneer(id: Int, firstName: String, lastName: String) extends BaptizedMalePublisher
case class MinisterialServant(id: Int, firstName: String, lastName: String) extends BaptizedMalePublisher
case class Elder(id: Int, firstName: String, lastName: String) extends BaptizedMalePublisher
trait Chairman extends Elder


// oclm assignments
trait Assignment

trait TreasuresFromGodsWord extends Assignment
case object TenMinutesTalk extends TreasuresFromGodsWord
case object SpiritualGems extends TreasuresFromGodsWord
case object BibleReading extends TreasuresFromGodsWord

trait ApplyYourselfToFieldMinistry extends Assignment
case object InitialCallVideo extends ApplyYourselfToFieldMinistry
case object InitialCall extends ApplyYourselfToFieldMinistry
case object ReturnVisitVideo extends ApplyYourselfToFieldMinistry
case object ReturnVisit extends ApplyYourselfToFieldMinistry
case object BibleStudy extends ApplyYourselfToFieldMinistry
case object FiveMinTalk extends ApplyYourselfToFieldMinistry

trait LivingAsChristians extends Assignment
case object CongregationBibleStudy extends LivingAsChristians