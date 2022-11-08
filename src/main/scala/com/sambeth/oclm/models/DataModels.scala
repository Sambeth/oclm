package com.sambeth.oclm.models

import java.util.concurrent.Flow.Publisher

enum Status:
  case Active, Inactive

enum Gender:
  case Male, Female

// entities
trait Member {
  def firstName: String
  def lastName: String
  def otherNames: Option[String] = None
  def age: Option[Int] = None
  def status: Option[Status] = None
  def recency: Option[Int] = None
  def gender: Gender
}

abstract case class SimpleMember(firstName: String, lastName: String) extends Member

sealed trait Student:
  def score: Option[Int] = None

abstract case class SimpleMemberWhoIsAStudent(firstName: String, lastName: String) extends Member with Student

sealed trait Publisher extends Member:
  this: Student =>

abstract case class UnbaptizedPublisher(firstName: String, lastName: String) extends Publisher, Student

trait BaptizedPublisher extends Publisher, Student

abstract case class SimpleBaptizedPublisher(firstName: String, lastName: String) extends BaptizedPublisher
abstract case class Pioneer(firstName: String, lastName: String) extends BaptizedPublisher
abstract case class MinisterialServant(firstName: String, lastName: String, gender: Gender) extends BaptizedPublisher
abstract case class Elder(firstName: String, lastName: String, gender: Gender) extends BaptizedPublisher
class Chairman(firstName: String, lastName: String, gender: Gender) extends Elder(firstName: String, lastName: String, gender: Gender)

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