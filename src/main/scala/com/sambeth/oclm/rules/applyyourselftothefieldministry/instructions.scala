package com.sambeth.oclm.rules.applyyourselftothefieldministry

import com.sambeth.oclm.models.*

// videos
trait CanBeAssignedInitialCallVideo[A <: Elder] {
  def assign(a: A): String
}

given chairmanCanBeAssignedTenMinutesTalk: CanBeAssignedInitialCallVideo[Chairman] = new CanBeAssignedInitialCallVideo[Chairman] {
  def assign(a: Chairman): String = s"${a.firstName} ${a.lastName}"
}

trait CanBeAssignedReturnVisitVideo[A <: Elder] {
  def assign(a: A): String
}

given elderCanBeAssignedSpiritualGems: CanBeAssignedReturnVisitVideo[Chairman] = new CanBeAssignedReturnVisitVideo[Chairman] {
  def assign(a: Chairman): String = s"${a.firstName} ${a.lastName}"
}

// initial calls
trait CanBeAssignedInitialCall[A <: Member[_, Student]] {
  def assign(a: A): String
}

given elderCanBeAssignedInitialCall: CanBeAssignedInitialCall[Elder] = new CanBeAssignedInitialCall[Elder] {
  def assign(a: Elder): String = s"${a.firstName} ${a.lastName}"
}

given ministerialServantCanBeAssignedInitialCall: CanBeAssignedInitialCall[MinisterialServant] = new CanBeAssignedInitialCall[MinisterialServant] {
  def assign(a: MinisterialServant): String = s"${a.firstName} ${a.lastName}"
}

given pioneerCanBeAssignedInitialCall: CanBeAssignedInitialCall[Pioneer[_]] = new CanBeAssignedInitialCall[Pioneer[_]] {
  def assign(a: Pioneer[_]): String = s"${a.firstName} ${a.lastName}"
}

given simpleMemberWhoIsAStudentCanBeAssignedInitialCall: CanBeAssignedInitialCall[SimpleMemberWhoIsAStudent[_]] = new CanBeAssignedInitialCall[SimpleMemberWhoIsAStudent[_]] {
  def assign(a: SimpleMemberWhoIsAStudent[_]): String = s"${a.firstName} ${a.lastName}"
}

given simpleBaptizedPublisherCanBeAssignedInitialCall: CanBeAssignedInitialCall[SimpleBaptizedPublisher[_]] = new CanBeAssignedInitialCall[SimpleBaptizedPublisher[_]] {
  def assign(a: SimpleBaptizedPublisher[_]): String = s"${a.firstName} ${a.lastName}"
}

given unbaptizedPublisherCanBeAssignedInitialCall: CanBeAssignedInitialCall[UnbaptizedPublisher[_]] = new CanBeAssignedInitialCall[UnbaptizedPublisher[_]] {
  def assign(a: UnbaptizedPublisher[_]): String = s"${a.firstName} ${a.lastName}"
}

// return visits
trait CanBeAssignedReturnVisit[A <: Member[_, Student]] {
  def assign(a: A): String
}

given elderCanBeAssignedReturnVisit: CanBeAssignedReturnVisit[Elder] = new CanBeAssignedReturnVisit[Elder] {
  def assign(a: Elder): String = s"${a.firstName} ${a.lastName}"
}

given ministerialServantCanBeAssignedReturnVisit: CanBeAssignedReturnVisit[MinisterialServant] = new CanBeAssignedReturnVisit[MinisterialServant] {
  def assign(a: MinisterialServant): String = s"${a.firstName} ${a.lastName}"
}

given pioneerCanBeAssignedReturnVisit: CanBeAssignedReturnVisit[Pioneer[_]] = new CanBeAssignedReturnVisit[Pioneer[_]] {
  def assign(a: Pioneer[_]): String = s"${a.firstName} ${a.lastName}"
}

given simpleMemberWhoIsAStudentCanBeAssignedReturnVisit: CanBeAssignedReturnVisit[SimpleMemberWhoIsAStudent[_]] = new CanBeAssignedReturnVisit[SimpleMemberWhoIsAStudent[_]] {
  def assign(a: SimpleMemberWhoIsAStudent[_]): String = s"${a.firstName} ${a.lastName}"
}

given simpleBaptizedPublisherCanBeAssignedReturnVisit: CanBeAssignedReturnVisit[SimpleBaptizedPublisher[_]] = new CanBeAssignedReturnVisit[SimpleBaptizedPublisher[_]] {
  def assign(a: SimpleBaptizedPublisher[_]): String = s"${a.firstName} ${a.lastName}"
}

given unbaptizedPublisherCanBeAssignedReturnVisit: CanBeAssignedReturnVisit[UnbaptizedPublisher[_]] = new CanBeAssignedReturnVisit[UnbaptizedPublisher[_]] {
  def assign(a: UnbaptizedPublisher[_]): String = s"${a.firstName} ${a.lastName}"
}

// bible studies
trait CanBeAssignedBibleStudy[A <: Member[_, Student]] {
  def assign(a: A): String
}

given elderCanBeAssignedBibleStudy: CanBeAssignedBibleStudy[Elder] = new CanBeAssignedBibleStudy[Elder] {
  def assign(a: Elder): String = s"${a.firstName} ${a.lastName}"
}

given ministerialServantCanBeAssignedBibleStudy: CanBeAssignedBibleStudy[MinisterialServant] = new CanBeAssignedBibleStudy[MinisterialServant] {
  def assign(a: MinisterialServant): String = s"${a.firstName} ${a.lastName}"
}

given pioneerCanBeAssignedBibleStudy: CanBeAssignedBibleStudy[Pioneer[_]] = new CanBeAssignedBibleStudy[Pioneer[_]] {
  def assign(a: Pioneer[_]): String = s"${a.firstName} ${a.lastName}"
}

given simpleBaptizedPublisherCanBeAssignedBibleStudy: CanBeAssignedBibleStudy[SimpleBaptizedPublisher[_]] = new CanBeAssignedBibleStudy[SimpleBaptizedPublisher[_]] {
  def assign(a: SimpleBaptizedPublisher[_]): String = s"${a.firstName} ${a.lastName}"
}

// 5 minutes talks
trait CanBeAssignedFiveMinTalk[A <: Member[Male, Student]] {
  def assign(a: A): String
}

given elderCanBeAssignedFiveMinTalk: CanBeAssignedFiveMinTalk[Elder] = new CanBeAssignedFiveMinTalk[Elder] {
  def assign(a: Elder): String = s"${a.firstName} ${a.lastName}"
}

given ministerialServantCanBeAssignedFiveMinTalk: CanBeAssignedFiveMinTalk[MinisterialServant] = new CanBeAssignedFiveMinTalk[MinisterialServant] {
  def assign(a: MinisterialServant): String = s"${a.firstName} ${a.lastName}"
}

given pioneerCanBeAssignedFiveMinTalk: CanBeAssignedFiveMinTalk[Pioneer[Male]] = new CanBeAssignedFiveMinTalk[Pioneer[Male]] {
  def assign(a: Pioneer[Male]): String = s"${a.firstName} ${a.lastName}"
}

given simpleBaptizedPublisherCanBeAssignedFiveMinTalk: CanBeAssignedFiveMinTalk[SimpleBaptizedPublisher[Male]] = new CanBeAssignedFiveMinTalk[SimpleBaptizedPublisher[Male]] {
  def assign(a: SimpleBaptizedPublisher[Male]): String = s"${a.firstName} ${a.lastName}"
}