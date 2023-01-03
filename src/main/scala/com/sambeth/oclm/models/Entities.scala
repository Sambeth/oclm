package com.sambeth.oclm.models


object Status extends Enumeration {
  type Status = Value
  val Active, Inactive = Value
}

sealed trait Gender
trait Male extends Gender
trait Female extends Gender


sealed trait Potential
sealed trait Student extends Potential {
  def score: Option[Int] = None
}

sealed trait NonStudent extends Potential

// entities
trait Member[G <: Gender, P <: Potential] {
  def acceptablePair[M <: Member[G, P]](member: M): Boolean
}

//case class SimpleFemaleMember(id: Int, firstName: String, lastName: String) extends Member[Female, NonStudent] {
//  override def acceptablePair[M <: Member[Female, NonStudent]](member: M): Boolean = member match {
//    case m: SimpleFemaleMember => false
//    case m: SimpleFemaleMemberWhoIsAStudent => false
//    case m: UnbaptizedFemalePublisher => false
//    case m: SimpleBaptizedFemalePublisher => false
//    case m: FemalePioneer => false
//    case _ => false
//  }
//}
//case class SimpleMaleMember(id: Int, firstName: String, lastName: String) extends Member[Male, NonStudent] {
//  override def acceptablePair[M <: Member[Male, NonStudent]](member: M): Boolean = member match {
//    case m: SimpleMaleMember => false
//    case m: SimpleMaleMemberWhoIsAStudent => false
//    case m: UnbaptizedMalePublisher => false
//    case m: SimpleBaptizedMalePublisher => false
//    case m: MalePioneer => false
//    case m: MinisterialServant => false
//    case m: Elder => false
//    case _ => false
//  }
//}

case class SimpleFemaleMemberWhoIsAStudent(id: String, firstName: String, lastName: String) extends Member[Female, Student] {
  override def acceptablePair[M <: Member[Female, Student]](member: M): Boolean = member match {
//    case m: SimpleFemaleMember => true
    case m: SimpleFemaleMemberWhoIsAStudent => true
    case m: UnbaptizedFemalePublisher => false
    case m: SimpleBaptizedFemalePublisher => false
    case m: FemalePioneer => false
    case _ => false
  }
}
case class SimpleMaleMemberWhoIsAStudent(id: String, firstName: String, lastName: String) extends Member[Male, Student] {
  override def acceptablePair[M <: Member[Male, Student]](member: M): Boolean = member match {
//    case m: SimpleMaleMember => true
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

case class UnbaptizedFemalePublisher(id: String, firstName: String, lastName: String) extends FemalePublisher {
  override def acceptablePair[M <: Member[Female, Student]](member: M): Boolean = member match {
//    case m: SimpleFemaleMember => true
    case m: SimpleFemaleMemberWhoIsAStudent => true
    case m: UnbaptizedFemalePublisher => true
    case m: SimpleBaptizedFemalePublisher => false
    case m: FemalePioneer => false
    case _ => false
  }
}
case class UnbaptizedMalePublisher(id: String, firstName: String, lastName: String) extends MalePublisher {
  override def acceptablePair[M <: Member[Male, Student]](member: M): Boolean = member match {
//    case m: SimpleMaleMember => true
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

case class SimpleBaptizedFemalePublisher(id: String, firstName: String, lastName: String) extends BaptizedFemalePublisher {
  override def acceptablePair[M <: Member[Female, Student]](member: M): Boolean = member match {
//    case m: SimpleFemaleMember => true
    case m: SimpleFemaleMemberWhoIsAStudent => true
    case m: UnbaptizedFemalePublisher => true
    case m: SimpleBaptizedFemalePublisher => true
    case m: FemalePioneer => false
    case _ => false
  }
}
case class SimpleBaptizedMalePublisher(id: String, firstName: String, lastName: String) extends BaptizedMalePublisher {
  override def acceptablePair[M <: Member[Male, Student]](member: M): Boolean = member match {
//    case m: SimpleMaleMember => true
    case m: SimpleMaleMemberWhoIsAStudent => true
    case m: UnbaptizedMalePublisher => true
    case m: SimpleBaptizedMalePublisher => true
    case m: MalePioneer => false
    case m: MinisterialServant => false
    case m: Elder => false
    case _ => false
  }
}

case class FemalePioneer(id: String, firstName: String, lastName: String) extends BaptizedFemalePublisher {
  override def acceptablePair[M <: Member[Female, Student]](member: M): Boolean = member match {
//    case m: SimpleFemaleMember => true
    case m: SimpleFemaleMemberWhoIsAStudent => true
    case m: UnbaptizedFemalePublisher => true
    case m: SimpleBaptizedFemalePublisher => true
    case m: FemalePioneer => true
    case _ => false
  }
}
case class MalePioneer(id: String, firstName: String, lastName: String) extends BaptizedMalePublisher {
  override def acceptablePair[M <: Member[Male, Student]](member: M): Boolean = member match {
//    case m: SimpleMaleMember => true
    case m: SimpleMaleMemberWhoIsAStudent => true
    case m: UnbaptizedMalePublisher => true
    case m: SimpleBaptizedMalePublisher => true
    case m: MalePioneer => true
    case m: MinisterialServant => false
    case m: Elder => false
    case _ => false
  }
}

case class MinisterialServant(id: String, firstName: String, lastName: String) extends BaptizedMalePublisher with Member[Male, Student] {
  override def acceptablePair[M <: Member[Male, Student]](member: M): Boolean = member match {
//    case m: SimpleMaleMember => true
    case m: SimpleMaleMemberWhoIsAStudent => true
    case m: UnbaptizedMalePublisher => true
    case m: SimpleBaptizedMalePublisher => true
    case m: MalePioneer => true
    case m: MinisterialServant => true
    case m: Elder => false
    case _ => false
  }
}
case class Elder(id: String, firstName: String, lastName: String) extends BaptizedMalePublisher with Member[Male, Student] {
  override def acceptablePair[M <: Member[Male, Student]](member: M): Boolean = member match {
//    case m: SimpleMaleMember => true
    case m: SimpleMaleMemberWhoIsAStudent => true
    case m: UnbaptizedMalePublisher => true
    case m: SimpleBaptizedMalePublisher => true
    case m: MalePioneer => true
    case m: MinisterialServant => true
    case m: Elder => true
    case _ => false
  }
}
