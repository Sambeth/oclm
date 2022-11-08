package com.sambeth.oclm.rules.applyyourselftothefieldministry

import com.sambeth.oclm.models.*

// videos
trait CanBeAssignedInitialCallVideo[A] {
  def assign(a: A): String
}

implicit val chairmanCanBeAssignedTenMinutesTalk: CanBeAssignedInitialCallVideo[Chairman] = new CanBeAssignedInitialCallVideo[Chairman] {
  def assign(a: Chairman): String = s"${a.firstName} ${a.lastName}"
}

trait CanBeAssignedReturnVisitVideo[A] {
  def assign(a: A): String
}

implicit val elderCanBeAssignedSpiritualGems: CanBeAssignedReturnVisitVideo[Chairman] = new CanBeAssignedReturnVisitVideo[Chairman] {
  def assign(a: Chairman): String = s"${a.firstName} ${a.lastName}"
}

// initial calls
trait CanBeAssignedInitialCall[A] {
  def assign(a: A): String
}

implicit val elderCanBeAssignedInitialCall: CanBeAssignedInitialCall[Elder] = new CanBeAssignedInitialCall[Elder] {
  def assign(a: Elder): String = s"${a.firstName} ${a.lastName}"
}

implicit val ministerialServantCanBeAssignedInitialCall: CanBeAssignedInitialCall[MinisterialServant] = new CanBeAssignedInitialCall[MinisterialServant] {
  def assign(a: MinisterialServant): String = s"${a.firstName} ${a.lastName}"
}

implicit val pioneerCanBeAssignedInitialCall: CanBeAssignedInitialCall[Pioneer] = new CanBeAssignedInitialCall[Pioneer] {
  def assign(a: Pioneer): String = s"${a.firstName} ${a.lastName}"
}

implicit val simpleMemberWhoIsAStudentCanBeAssignedInitialCall: CanBeAssignedInitialCall[SimpleMemberWhoIsAStudent] = new CanBeAssignedInitialCall[SimpleMemberWhoIsAStudent] {
  def assign(a: SimpleMemberWhoIsAStudent): String = s"${a.firstName} ${a.lastName}"
}

implicit val simpleBaptizedPublisherCanBeAssignedInitialCall: CanBeAssignedInitialCall[SimpleBaptizedPublisher] = new CanBeAssignedInitialCall[SimpleBaptizedPublisher] {
  def assign(a: SimpleBaptizedPublisher): String = s"${a.firstName} ${a.lastName}"
}

implicit val unbaptizedPublisherCanBeAssignedInitialCall: CanBeAssignedInitialCall[UnbaptizedPublisher] = new CanBeAssignedInitialCall[UnbaptizedPublisher] {
  def assign(a: UnbaptizedPublisher): String = s"${a.firstName} ${a.lastName}"
}

// return visits
trait CanBeAssignedReturnVisit[A] {
  def assign(a: A): String
}

implicit val elderCanBeAssignedReturnVisit: CanBeAssignedReturnVisit[Elder] = new CanBeAssignedReturnVisit[Elder] {
  def assign(a: Elder): String = s"${a.firstName} ${a.lastName}"
}

implicit val ministerialServantCanBeAssignedReturnVisit: CanBeAssignedReturnVisit[MinisterialServant] = new CanBeAssignedReturnVisit[MinisterialServant] {
  def assign(a: MinisterialServant): String = s"${a.firstName} ${a.lastName}"
}

implicit val pioneerCanBeAssignedReturnVisit: CanBeAssignedReturnVisit[Pioneer] = new CanBeAssignedReturnVisit[Pioneer] {
  def assign(a: Pioneer): String = s"${a.firstName} ${a.lastName}"
}

implicit val simpleMemberWhoIsAStudentCanBeAssignedReturnVisit: CanBeAssignedReturnVisit[SimpleMemberWhoIsAStudent] = new CanBeAssignedReturnVisit[SimpleMemberWhoIsAStudent] {
  def assign(a: SimpleMemberWhoIsAStudent): String = s"${a.firstName} ${a.lastName}"
}

implicit val simpleBaptizedPublisherCanBeAssignedReturnVisit: CanBeAssignedReturnVisit[SimpleBaptizedPublisher] = new CanBeAssignedReturnVisit[SimpleBaptizedPublisher] {
  def assign(a: SimpleBaptizedPublisher): String = s"${a.firstName} ${a.lastName}"
}

implicit val unbaptizedPublisherCanBeAssignedReturnVisit: CanBeAssignedReturnVisit[UnbaptizedPublisher] = new CanBeAssignedReturnVisit[UnbaptizedPublisher] {
  def assign(a: UnbaptizedPublisher): String = s"${a.firstName} ${a.lastName}"
}

// bible studies
trait CanBeAssignedBibleStudy[A] {
  def assign(a: A): String
}

implicit val elderCanBeAssignedBibleStudy: CanBeAssignedBibleStudy[Elder] = new CanBeAssignedBibleStudy[Elder] {
  def assign(a: Elder): String = s"${a.firstName} ${a.lastName}"
}

implicit val ministerialServantCanBeAssignedBibleStudy: CanBeAssignedBibleStudy[MinisterialServant] = new CanBeAssignedBibleStudy[MinisterialServant] {
  def assign(a: MinisterialServant): String = s"${a.firstName} ${a.lastName}"
}

implicit val pioneerCanBeAssignedBibleStudy: CanBeAssignedBibleStudy[Pioneer] = new CanBeAssignedBibleStudy[Pioneer] {
  def assign(a: Pioneer): String = s"${a.firstName} ${a.lastName}"
}

implicit val simpleMemberWhoIsAStudentCanBeAssignedBibleStudy: CanBeAssignedBibleStudy[SimpleMemberWhoIsAStudent] = new CanBeAssignedBibleStudy[SimpleMemberWhoIsAStudent] {
  def assign(a: SimpleMemberWhoIsAStudent): String = s"${a.firstName} ${a.lastName}"
}

implicit val simpleBaptizedPublisherCanBeAssignedBibleStudy: CanBeAssignedBibleStudy[SimpleBaptizedPublisher] = new CanBeAssignedBibleStudy[SimpleBaptizedPublisher] {
  def assign(a: SimpleBaptizedPublisher): String = s"${a.firstName} ${a.lastName}"
}

implicit val unbaptizedPublisherCanBeAssignedBibleStudy: CanBeAssignedBibleStudy[UnbaptizedPublisher] = new CanBeAssignedBibleStudy[UnbaptizedPublisher] {
  def assign(a: UnbaptizedPublisher): String = s"${a.firstName} ${a.lastName}"
}

// 5 minutes talks
trait CanBeAssignedFiveMinTalk[A] {
  def assign(a: A): String
}

implicit val elderCanBeAssignedFiveMinTalk: CanBeAssignedFiveMinTalk[Elder] = new CanBeAssignedFiveMinTalk[Elder] {
  def assign(a: Elder): String = s"${a.firstName} ${a.lastName}"
}

implicit val ministerialServantCanBeAssignedFiveMinTalk: CanBeAssignedFiveMinTalk[MinisterialServant] = new CanBeAssignedFiveMinTalk[MinisterialServant] {
  def assign(a: MinisterialServant): String = s"${a.firstName} ${a.lastName}"
}

implicit val pioneerCanBeAssignedFiveMinTalk: CanBeAssignedFiveMinTalk[Pioneer] = new CanBeAssignedFiveMinTalk[Pioneer] {
  def assign(a: Pioneer): String = s"${a.firstName} ${a.lastName}"
}

implicit val simpleBaptizedPublisherCanBeAssignedFiveMinTalk: CanBeAssignedFiveMinTalk[SimpleBaptizedPublisher] = new CanBeAssignedFiveMinTalk[SimpleBaptizedPublisher] {
  def assign(a: SimpleBaptizedPublisher): String = s"${a.firstName} ${a.lastName}"
}