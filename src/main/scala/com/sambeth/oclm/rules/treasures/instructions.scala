package com.sambeth.oclm.rules.treasures

import com.sambeth.oclm.models.*

// treasure from God's word assignments
trait CanBeAssignedTenMinutesTalk[A <: Member[Male, Student]] {
  def assign(a: A): String
}

given elderCanBeAssignedTenMinutesTalk: CanBeAssignedTenMinutesTalk[Elder] = new CanBeAssignedTenMinutesTalk[Elder] {
  def assign(a: Elder): String = s"${a.firstName} ${a.lastName}"
}

given ministerialServantCanBeAssignedTenMinutesTalk: CanBeAssignedTenMinutesTalk[MinisterialServant] = new CanBeAssignedTenMinutesTalk[MinisterialServant] {
  def assign(a: MinisterialServant): String = s"${a.firstName} ${a.lastName}"
}

trait CanBeAssignedSpiritualGems[A <: Member[Male, Student]] {
  def assign(a: A): String
}

given elderCanBeAssignedSpiritualGems: CanBeAssignedSpiritualGems[Elder] = new CanBeAssignedSpiritualGems[Elder] {
  def assign(a: Elder): String = s"${a.firstName} ${a.lastName}"
}

given ministerialServantCanBeAssignedSpiritualGems: CanBeAssignedSpiritualGems[MinisterialServant] = new CanBeAssignedSpiritualGems[MinisterialServant] {
  def assign(a: MinisterialServant): String = s"${a.firstName} ${a.lastName}"
}

trait CanBeAssignedBibleReading[A <: Member[Male, Student]] {
  def assign(a: A): String
}

given elderCanBeAssignedBibleReading: CanBeAssignedBibleReading[Elder] = new CanBeAssignedBibleReading[Elder] {
  def assign(a: Elder): String = s"${a.firstName} ${a.lastName}"
}

given ministerialServantCanBeAssignedBibleReading: CanBeAssignedBibleReading[MinisterialServant] = new CanBeAssignedBibleReading[MinisterialServant] {
  def assign(a: MinisterialServant): String = s"${a.firstName} ${a.lastName}"
}

// has to be Male gender
given pioneerCanBeAssignedBibleReading: CanBeAssignedBibleReading[Pioneer[Male]] = new CanBeAssignedBibleReading[Pioneer[Male]] {
  def assign(a: Pioneer[Male]): String = s"${a.firstName} ${a.lastName}"
}

given simpleMemberWhoIsAStudentCanBeAssignedBibleReading: CanBeAssignedBibleReading[SimpleMemberWhoIsAStudent[Male]] = new CanBeAssignedBibleReading[SimpleMemberWhoIsAStudent[Male]] {
  def assign(a: SimpleMemberWhoIsAStudent[Male]): String = s"${a.firstName} ${a.lastName}"
}

given simpleBaptizedPublisherCanBeAssignedBibleReading: CanBeAssignedBibleReading[SimpleBaptizedPublisher[Male]] = new CanBeAssignedBibleReading[SimpleBaptizedPublisher[Male]] {
  def assign(a: SimpleBaptizedPublisher[Male]): String = s"${a.firstName} ${a.lastName}"
}

given unbaptizedPublisherCanBeAssignedBibleReading: CanBeAssignedBibleReading[UnbaptizedPublisher[Male]] = new CanBeAssignedBibleReading[UnbaptizedPublisher[Male]] {
  def assign(a: UnbaptizedPublisher[Male]): String = s"${a.firstName} ${a.lastName}"
}