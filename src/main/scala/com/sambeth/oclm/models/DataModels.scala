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
abstract case class SimpleMember(id: Int, firstName: String, lastName: String) extends Member[_, NonStudent]
abstract case class SimpleMemberWhoIsAStudent[G](id: Int, firstName: String, lastName: String) extends Member[G, Student]
sealed trait Publisher[G] extends Member[G, Student]
case class UnbaptizedPublisher[G](id: Int, firstName: String, lastName: String) extends Publisher[G]
trait BaptizedPublisher[G] extends Publisher[G]
case class SimpleBaptizedPublisher[G](id: Int, firstName: String, lastName: String) extends BaptizedPublisher[G]
case class Pioneer[G](id: Int, firstName: String, lastName: String) extends BaptizedPublisher[G]
case class MinisterialServant(id: Int, firstName: String, lastName: String) extends BaptizedPublisher[Male] with Member[Male, Student]
case class Elder(id: Int, firstName: String, lastName: String) extends BaptizedPublisher[Male] with Member[Male, Student]
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
trait AdHoc(title: String) extends LivingAsChristians
trait CongregationBibleStudy extends LivingAsChristians