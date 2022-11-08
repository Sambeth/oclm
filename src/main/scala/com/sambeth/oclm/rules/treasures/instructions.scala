package com.sambeth.oclm.rules.treasures

import com.sambeth.oclm.models.*

// treasure from God's word assignments
trait CanBeAssignedTenMinutesTalk[A] {
  def assign(a: A): String
}

implicit val elderCanBeAssignedTenMinutesTalk: CanBeAssignedTenMinutesTalk[Elder] = new CanBeAssignedTenMinutesTalk[Elder] {
  def assign(a: Elder): String = s"${a.firstName} ${a.lastName}"
}

implicit val ministerialServantCanBeAssignedTenMinutesTalk: CanBeAssignedTenMinutesTalk[MinisterialServant] = new CanBeAssignedTenMinutesTalk[MinisterialServant] {
  def assign(a: MinisterialServant): String = s"${a.firstName} ${a.lastName}"
}

trait CanBeAssignedSpiritualGems[A] {
  def assign(a: A): String
}

implicit val elderCanBeAssignedSpiritualGems: CanBeAssignedSpiritualGems[Elder] = new CanBeAssignedSpiritualGems[Elder] {
  def assign(a: Elder): String = s"${a.firstName} ${a.lastName}"
}

implicit val ministerialServantCanBeAssignedSpiritualGems: CanBeAssignedSpiritualGems[MinisterialServant] = new CanBeAssignedSpiritualGems[MinisterialServant] {
  def assign(a: MinisterialServant): String = s"${a.firstName} ${a.lastName}"
}

trait CanBeAssignedBibleReading[A] {
  def assign(a: A): String
}

implicit val elderCanBeAssignedBibleReading: CanBeAssignedBibleReading[Elder] = new CanBeAssignedBibleReading[Elder] {
  def assign(a: Elder): String = s"${a.firstName} ${a.lastName}"
}

implicit val ministerialServantCanBeAssignedBibleReading: CanBeAssignedBibleReading[MinisterialServant] = new CanBeAssignedBibleReading[MinisterialServant] {
  def assign(a: MinisterialServant): String = s"${a.firstName} ${a.lastName}"
}

// has to be Male gender
implicit val pioneerCanBeAssignedBibleReading: CanBeAssignedBibleReading[Pioneer] = new CanBeAssignedBibleReading[Pioneer] {
  def assign(a: Pioneer): String = s"${a.firstName} ${a.lastName}"
}

implicit val simpleMemberWhoIsAStudentCanBeAssignedBibleReading: CanBeAssignedBibleReading[SimpleMemberWhoIsAStudent] = new CanBeAssignedBibleReading[SimpleMemberWhoIsAStudent] {
  def assign(a: SimpleMemberWhoIsAStudent): String = s"${a.firstName} ${a.lastName}"
}

implicit val simpleBaptizedPublisherCanBeAssignedBibleReading: CanBeAssignedBibleReading[SimpleBaptizedPublisher] = new CanBeAssignedBibleReading[SimpleBaptizedPublisher] {
  def assign(a: SimpleBaptizedPublisher): String = s"${a.firstName} ${a.lastName}"
}

implicit val unbaptizedPublisherCanBeAssignedBibleReading: CanBeAssignedBibleReading[UnbaptizedPublisher] = new CanBeAssignedBibleReading[UnbaptizedPublisher] {
  def assign(a: UnbaptizedPublisher): String = s"${a.firstName} ${a.lastName}"
}