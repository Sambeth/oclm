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
given pioneerCanBeAssignedBibleReading: CanBeAssignedBibleReading[MalePioneer] = new CanBeAssignedBibleReading[MalePioneer] {
  def assign(a: MalePioneer): String = s"${a.firstName} ${a.lastName}"
}

given simpleMemberWhoIsAStudentCanBeAssignedBibleReading: CanBeAssignedBibleReading[SimpleMaleMemberWhoIsAStudent] = new CanBeAssignedBibleReading[SimpleMaleMemberWhoIsAStudent] {
  def assign(a: SimpleMaleMemberWhoIsAStudent): String = s"${a.firstName} ${a.lastName}"
}

given simpleBaptizedPublisherCanBeAssignedBibleReading: CanBeAssignedBibleReading[SimpleMaleBaptizedPublisher] = new CanBeAssignedBibleReading[SimpleMaleBaptizedPublisher] {
  def assign(a: SimpleMaleBaptizedPublisher): String = s"${a.firstName} ${a.lastName}"
}

given unbaptizedPublisherCanBeAssignedBibleReading: CanBeAssignedBibleReading[UnbaptizedMalePublisher] = new CanBeAssignedBibleReading[UnbaptizedMalePublisher] {
  def assign(a: UnbaptizedMalePublisher): String = s"${a.firstName} ${a.lastName}"
}