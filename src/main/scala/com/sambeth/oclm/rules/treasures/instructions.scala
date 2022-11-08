package com.sambeth.oclm.rules.treasures

import com.sambeth.oclm.models.*

// treasure from God's word assignments
trait CanBeAssignedTenMinutesTalk[A <: Member[Male, Student], B <: TreasuresFromGodsWord] {
  def assign(a: A)(using assignment: TenMinutesTalk): String = s"${a.firstName} ${a.lastName} can be assigned ${assignment.toString}"
}

given elderCanBeAssignedTenMinutesTalk: CanBeAssignedTenMinutesTalk[Elder, TenMinutesTalk] = new CanBeAssignedTenMinutesTalk[Elder, TenMinutesTalk] {}

given ministerialServantCanBeAssignedTenMinutesTalk: CanBeAssignedTenMinutesTalk[MinisterialServant, TenMinutesTalk] = new CanBeAssignedTenMinutesTalk[MinisterialServant, TenMinutesTalk] {}

trait CanBeAssignedSpiritualGems[A <: Member[Male, Student], B <: TreasuresFromGodsWord] {
  def assign(a: A)(using assignment: SpiritualGems): String = s"${a.firstName} ${a.lastName} can be assigned ${assignment.toString}"
}

given elderCanBeAssignedSpiritualGems: CanBeAssignedSpiritualGems[Elder, SpiritualGems] = new CanBeAssignedSpiritualGems[Elder, SpiritualGems] {}

given ministerialServantCanBeAssignedSpiritualGems: CanBeAssignedSpiritualGems[MinisterialServant, SpiritualGems] = new CanBeAssignedSpiritualGems[MinisterialServant, SpiritualGems] {}

trait CanBeAssignedBibleReading[A <: Member[Male, Student], B <: TreasuresFromGodsWord] {
  def assign(a: A)(using assignment: BibleReading): String = s"${a.firstName} ${a.lastName} can be assigned ${assignment.toString}"
}

given elderCanBeAssignedBibleReading: CanBeAssignedBibleReading[Elder, BibleReading] = new CanBeAssignedBibleReading[Elder, BibleReading] {}

given ministerialServantCanBeAssignedBibleReading: CanBeAssignedBibleReading[MinisterialServant, BibleReading] = new CanBeAssignedBibleReading[MinisterialServant, BibleReading] {}

given pioneerCanBeAssignedBibleReading: CanBeAssignedBibleReading[Pioneer[Male], BibleReading] = new CanBeAssignedBibleReading[Pioneer[Male], BibleReading] {}

given simpleMemberWhoIsAStudentCanBeAssignedBibleReading: CanBeAssignedBibleReading[SimpleMemberWhoIsAStudent[Male], BibleReading] = new CanBeAssignedBibleReading[SimpleMemberWhoIsAStudent[Male], BibleReading] {}

given simpleBaptizedPublisherCanBeAssignedBibleReading: CanBeAssignedBibleReading[SimpleBaptizedPublisher[Male], BibleReading] = new CanBeAssignedBibleReading[SimpleBaptizedPublisher[Male], BibleReading] {}

given unbaptizedPublisherCanBeAssignedBibleReading: CanBeAssignedBibleReading[UnbaptizedPublisher[Male], BibleReading] = new CanBeAssignedBibleReading[UnbaptizedPublisher[Male], BibleReading] {}