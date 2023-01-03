package com.sambeth.oclm.models

import scala.annotation.targetName

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
  def acceptablePair[M <: Member[G, P]](member: M): Boolean
}

case class SimpleFemaleMember(id: Int, firstName: String, lastName: String) extends Member[Female, NonStudent] {
  override def acceptablePair[M <: Member[Female, NonStudent]](member: M): Boolean = member match {
    case m: SimpleFemaleMember => false
    case m: SimpleFemaleMemberWhoIsAStudent => false
    case m: UnbaptizedFemalePublisher => false
    case m: SimpleBaptizedFemalePublisher => false
    case m: FemalePioneer => false
    case _ => false
  }
}
case class SimpleMaleMember(id: Int, firstName: String, lastName: String) extends Member[Male, NonStudent] {
  override def acceptablePair[M <: Member[Male, NonStudent]](member: M): Boolean = member match {
    case m: SimpleMaleMember => false
    case m: SimpleMaleMemberWhoIsAStudent => false
    case m: UnbaptizedMalePublisher => false
    case m: SimpleBaptizedMalePublisher => false
    case m: MalePioneer => false
    case m: MinisterialServant => false
    case m: Elder => false
    case _ => false
  }
}

case class SimpleFemaleMemberWhoIsAStudent(id: Int, firstName: String, lastName: String) extends Member[Female, Student] {
  override def acceptablePair[M <: Member[Female, Student]](member: M): Boolean = member match {
    case m: SimpleFemaleMember => true
    case m: SimpleFemaleMemberWhoIsAStudent => true
    case m: UnbaptizedFemalePublisher => false
    case m: SimpleBaptizedFemalePublisher => false
    case m: FemalePioneer => false
    case _ => false
  }
}
case class SimpleMaleMemberWhoIsAStudent(id: Int, firstName: String, lastName: String) extends Member[Male, Student] {
  override def acceptablePair[M <: Member[Male, Student]](member: M): Boolean = member match {
    case m: SimpleMaleMember => true
    case m: SimpleMaleMemberWhoIsAStudent => true
    case m: UnbaptizedMalePublisher => false
    case m: SimpleBaptizedMalePublisher => false
    case m: MalePioneer => false
    case m: MinisterialServant => false
    case m: Elder => false
    case _ => false
  }
}

sealed trait FemalePublisher extends Member[Female, Student]
sealed trait MalePublisher extends Member[Male, Student]

case class UnbaptizedFemalePublisher(id: Int, firstName: String, lastName: String) extends FemalePublisher {
  override def acceptablePair[M <: Member[Female, Student]](member: M): Boolean = member match {
    case m: SimpleFemaleMember => true
    case m: SimpleFemaleMemberWhoIsAStudent => true
    case m: UnbaptizedFemalePublisher => true
    case m: SimpleBaptizedFemalePublisher => false
    case m: FemalePioneer => false
    case _ => false
  }
}
case class UnbaptizedMalePublisher(id: Int, firstName: String, lastName: String) extends MalePublisher {
  override def acceptablePair[M <: Member[Male, Student]](member: M): Boolean = member match {
    case m: SimpleMaleMember => true
    case m: SimpleMaleMemberWhoIsAStudent => true
    case m: UnbaptizedMalePublisher => true
    case m: SimpleBaptizedMalePublisher => false
    case m: MalePioneer => false
    case m: MinisterialServant => false
    case m: Elder => false
    case _ => false
  }
}
trait BaptizedFemalePublisher extends FemalePublisher
trait BaptizedMalePublisher extends MalePublisher

case class SimpleBaptizedFemalePublisher(id: Int, firstName: String, lastName: String) extends BaptizedFemalePublisher {
  override def acceptablePair[M <: Member[Female, Student]](member: M): Boolean = member match {
    case m: SimpleFemaleMember => true
    case m: SimpleFemaleMemberWhoIsAStudent => true
    case m: UnbaptizedFemalePublisher => true
    case m: SimpleBaptizedFemalePublisher => true
    case m: FemalePioneer => false
    case _ => false
  }
}
case class SimpleBaptizedMalePublisher(id: Int, firstName: String, lastName: String) extends BaptizedMalePublisher {
  override def acceptablePair[M <: Member[Male, Student]](member: M): Boolean = member match {
    case m: SimpleMaleMember => true
    case m: SimpleMaleMemberWhoIsAStudent => true
    case m: UnbaptizedMalePublisher => true
    case m: SimpleBaptizedMalePublisher => true
    case m: MalePioneer => false
    case m: MinisterialServant => false
    case m: Elder => false
    case _ => false
  }
}

case class FemalePioneer(id: Int, firstName: String, lastName: String) extends BaptizedFemalePublisher {
  override def acceptablePair[M <: Member[Female, Student]](member: M): Boolean = member match {
    case m: SimpleFemaleMember => true
    case m: SimpleFemaleMemberWhoIsAStudent => true
    case m: UnbaptizedFemalePublisher => true
    case m: SimpleBaptizedFemalePublisher => true
    case m: FemalePioneer => true
    case _ => false
  }
}
case class MalePioneer(id: Int, firstName: String, lastName: String) extends BaptizedMalePublisher {
  override def acceptablePair[M <: Member[Male, Student]](member: M): Boolean = member match {
    case m: SimpleMaleMember => true
    case m: SimpleMaleMemberWhoIsAStudent => true
    case m: UnbaptizedMalePublisher => true
    case m: SimpleBaptizedMalePublisher => true
    case m: MalePioneer => true
    case m: MinisterialServant => false
    case m: Elder => false
    case _ => false
  }
}

case class MinisterialServant(id: Int, firstName: String, lastName: String) extends BaptizedMalePublisher with Member[Male, Student] {
  override def acceptablePair[M <: Member[Male, Student]](member: M): Boolean = member match {
    case m: SimpleMaleMember => true
    case m: SimpleMaleMemberWhoIsAStudent => true
    case m: UnbaptizedMalePublisher => true
    case m: SimpleBaptizedMalePublisher => true
    case m: MalePioneer => true
    case m: MinisterialServant => true
    case m: Elder => false
    case _ => false
  }
}
case class Elder(id: Int, firstName: String, lastName: String) extends BaptizedMalePublisher with Member[Male, Student] {
  override def acceptablePair[M <: Member[Male, Student]](member: M): Boolean = member match {
    case m: SimpleMaleMember => true
    case m: SimpleMaleMemberWhoIsAStudent => true
    case m: UnbaptizedMalePublisher => true
    case m: SimpleBaptizedMalePublisher => true
    case m: MalePioneer => true
    case m: MinisterialServant => true
    case m: Elder => true
    case _ => false
  }
}


// oclm assignments
trait Assignment {
  def owner: Member[_, Student]
}

case class Chairman(owner: Elder) extends Assignment
case class OpeningPrayer(owner: Elder | MinisterialServant | MalePioneer | SimpleBaptizedMalePublisher) extends Assignment
case class ClosingPrayer(owner: Elder | MinisterialServant | MalePioneer | SimpleBaptizedMalePublisher) extends Assignment

trait TreasuresFromGodsWord extends Assignment
case class TenMinutesTalk(owner: Elder | MinisterialServant) extends TreasuresFromGodsWord
case class SpiritualGems(owner: Elder | MinisterialServant) extends TreasuresFromGodsWord
case class BibleReading(owner: Member[Male, Student]) extends TreasuresFromGodsWord

trait ApplyYourselfToFieldMinistry extends Assignment
case class InitialCallVideo(owner: Member[Male, Student]) extends ApplyYourselfToFieldMinistry
case class ReturnVisitVideo(owner: Member[Male, Student]) extends ApplyYourselfToFieldMinistry
case class InitialCall(owner: Member[_, Student], support: Member[_, Student]) extends ApplyYourselfToFieldMinistry
case class ReturnVisit(owner: Member[_, Student], support: Member[_, Student]) extends ApplyYourselfToFieldMinistry
case class BibleStudy(owner: Member[_, Student], support: Member[_, Student]) extends ApplyYourselfToFieldMinistry
case class FiveMinutesTalk(owner: Member[Male, Student]) extends ApplyYourselfToFieldMinistry

trait LivingAsChristians extends Assignment
case class AdHoc(title: String, owner: Elder | MinisterialServant) extends LivingAsChristians
case class CongregationBibleStudy(owner: Elder) extends LivingAsChristians