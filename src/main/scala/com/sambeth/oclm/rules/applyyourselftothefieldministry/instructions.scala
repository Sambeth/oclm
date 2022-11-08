package com.sambeth.oclm.rules.applyyourselftothefieldministry

import com.sambeth.oclm.models.*

// videos
trait CanBeAssignedInitialCallVideo[A <: Elder, B <: ApplyYourselfToFieldMinistry] {
  def assign(a: A)(using assignment: InitialCallVideo): String = s"${a.firstName} ${a.lastName} can be assigned ${assignment.toString}"
}

given chairmanCanBeAssignedTenMinutesTalk: CanBeAssignedInitialCallVideo[Chairman, InitialCallVideo] = new CanBeAssignedInitialCallVideo[Chairman, InitialCallVideo] {}

trait CanBeAssignedReturnVisitVideo[A <: Elder, B <: ApplyYourselfToFieldMinistry] {
  def assign(a: A)(using assignment: ReturnVisitVideo): String = s"${a.firstName} ${a.lastName} can be assigned ${assignment.toString}"
}

given elderCanBeAssignedSpiritualGems: CanBeAssignedReturnVisitVideo[Chairman, ReturnVisitVideo] = new CanBeAssignedReturnVisitVideo[Chairman, ReturnVisitVideo] {}

// initial calls
trait CanBeAssignedInitialCall[A <: Member[_, Student], B <: ApplyYourselfToFieldMinistry] {
  def assign(a: A)(using assignment: InitialCall): String = s"${a.firstName} ${a.lastName} can be assigned ${assignment.toString}"
}

given elderCanBeAssignedInitialCall: CanBeAssignedInitialCall[Elder, InitialCall] = new CanBeAssignedInitialCall[Elder, InitialCall] {}

given ministerialServantCanBeAssignedInitialCall: CanBeAssignedInitialCall[MinisterialServant, InitialCall] = new CanBeAssignedInitialCall[MinisterialServant, InitialCall] {}

given pioneerCanBeAssignedInitialCall: CanBeAssignedInitialCall[Pioneer[_], InitialCall] = new CanBeAssignedInitialCall[Pioneer[_], InitialCall] {}

given simpleMemberWhoIsAStudentCanBeAssignedInitialCall: CanBeAssignedInitialCall[SimpleMemberWhoIsAStudent[_], InitialCall] = new CanBeAssignedInitialCall[SimpleMemberWhoIsAStudent[_], InitialCall] {}

given simpleBaptizedPublisherCanBeAssignedInitialCall: CanBeAssignedInitialCall[SimpleBaptizedPublisher[_], InitialCall] = new CanBeAssignedInitialCall[SimpleBaptizedPublisher[_], InitialCall] {}

given unbaptizedPublisherCanBeAssignedInitialCall: CanBeAssignedInitialCall[UnbaptizedPublisher[_], InitialCall] = new CanBeAssignedInitialCall[UnbaptizedPublisher[_], InitialCall] {}

// return visits
trait CanBeAssignedReturnVisit[A <: Member[_, Student], B <: ApplyYourselfToFieldMinistry] {
  def assign(a: A)(using assignment: ReturnVisit): String = s"${a.firstName} ${a.lastName} can be assigned ${assignment.toString}"
}

given elderCanBeAssignedReturnVisit: CanBeAssignedReturnVisit[Elder, ReturnVisit] = new CanBeAssignedReturnVisit[Elder, ReturnVisit] {}

given ministerialServantCanBeAssignedReturnVisit: CanBeAssignedReturnVisit[MinisterialServant, ReturnVisit] = new CanBeAssignedReturnVisit[MinisterialServant, ReturnVisit] {}

given pioneerCanBeAssignedReturnVisit: CanBeAssignedReturnVisit[Pioneer[_], ReturnVisit] = new CanBeAssignedReturnVisit[Pioneer[_], ReturnVisit] {}

given simpleMemberWhoIsAStudentCanBeAssignedReturnVisit: CanBeAssignedReturnVisit[SimpleMemberWhoIsAStudent[_], ReturnVisit] = new CanBeAssignedReturnVisit[SimpleMemberWhoIsAStudent[_], ReturnVisit] {}

given simpleBaptizedPublisherCanBeAssignedReturnVisit: CanBeAssignedReturnVisit[SimpleBaptizedPublisher[_], ReturnVisit] = new CanBeAssignedReturnVisit[SimpleBaptizedPublisher[_], ReturnVisit] {}

given unbaptizedPublisherCanBeAssignedReturnVisit: CanBeAssignedReturnVisit[UnbaptizedPublisher[_], ReturnVisit] = new CanBeAssignedReturnVisit[UnbaptizedPublisher[_], ReturnVisit] {}

// bible studies
trait CanBeAssignedBibleStudy[A <: Member[_, Student], B <: ApplyYourselfToFieldMinistry] {
  def assign(a: A)(using assignment: BibleStudy): String = s"${a.firstName} ${a.lastName} can be assigned ${assignment.toString}"
}

given elderCanBeAssignedBibleStudy: CanBeAssignedBibleStudy[Elder, BibleStudy] = new CanBeAssignedBibleStudy[Elder, BibleStudy] {}

given ministerialServantCanBeAssignedBibleStudy: CanBeAssignedBibleStudy[MinisterialServant, BibleStudy] = new CanBeAssignedBibleStudy[MinisterialServant, BibleStudy] {}

given pioneerCanBeAssignedBibleStudy: CanBeAssignedBibleStudy[Pioneer[_], BibleStudy] = new CanBeAssignedBibleStudy[Pioneer[_], BibleStudy] {}

given simpleBaptizedPublisherCanBeAssignedBibleStudy: CanBeAssignedBibleStudy[SimpleBaptizedPublisher[_], BibleStudy] = new CanBeAssignedBibleStudy[SimpleBaptizedPublisher[_], BibleStudy] {}

// 5 minutes talks
trait CanBeAssignedFiveMinTalk[A <: Member[Male, Student], B <: ApplyYourselfToFieldMinistry] {
  def assign(a: A)(using assignment: FiveMinTalk): String = s"${a.firstName} ${a.lastName} can be assigned ${assignment.toString}"
}

given elderCanBeAssignedFiveMinTalk: CanBeAssignedFiveMinTalk[Elder, FiveMinTalk] = new CanBeAssignedFiveMinTalk[Elder, FiveMinTalk] {}

given ministerialServantCanBeAssignedFiveMinTalk: CanBeAssignedFiveMinTalk[MinisterialServant, FiveMinTalk] = new CanBeAssignedFiveMinTalk[MinisterialServant, FiveMinTalk] {}

given pioneerCanBeAssignedFiveMinTalk: CanBeAssignedFiveMinTalk[Pioneer[Male], FiveMinTalk] = new CanBeAssignedFiveMinTalk[Pioneer[Male], FiveMinTalk] {}

given simpleBaptizedPublisherCanBeAssignedFiveMinTalk: CanBeAssignedFiveMinTalk[SimpleBaptizedPublisher[Male], FiveMinTalk] = new CanBeAssignedFiveMinTalk[SimpleBaptizedPublisher[Male], FiveMinTalk] {}