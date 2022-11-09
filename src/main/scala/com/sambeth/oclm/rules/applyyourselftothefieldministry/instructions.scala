package com.sambeth.oclm.rules.applyyourselftothefieldministry

import com.sambeth.oclm.models.*

// videos
trait CanBeAssignedInitialCallVideo[B <: ApplyYourselfToFieldMinistry] {
  def assign(a: Elder)(using assignment: InitialCallVideo): String = s"${a.firstName} ${a.lastName} can be assigned ${assignment.toString}"
}

given elderCanBeAssignedInitialCallVideo: CanBeAssignedInitialCallVideo[InitialCallVideo] = new CanBeAssignedInitialCallVideo[InitialCallVideo] {}

trait CanBeAssignedReturnVisitVideo[B <: ApplyYourselfToFieldMinistry] {
  def assign(a: Elder)(using assignment: ReturnVisitVideo): String = s"${a.firstName} ${a.lastName} can be assigned ${assignment.toString}"
}

given elderCanBeAssignedReturnVisitVideo: CanBeAssignedReturnVisitVideo[ReturnVisitVideo] = new CanBeAssignedReturnVisitVideo[ReturnVisitVideo] {}

// initial calls
trait CanBeAssignedInitialCall[A <: Member[_, Student], B <: ApplyYourselfToFieldMinistry] {
  def assign(a: A)(using assignment: InitialCall): String = s"${a.firstName} ${a.lastName} can be assigned ${assignment.toString}"
}

given elderCanBeAssignedInitialCall: CanBeAssignedInitialCall[Elder, InitialCall] = new CanBeAssignedInitialCall[Elder, InitialCall] {}

given ministerialServantCanBeAssignedInitialCall: CanBeAssignedInitialCall[MinisterialServant, InitialCall] = new CanBeAssignedInitialCall[MinisterialServant, InitialCall] {}

given pioneerCanBeAssignedInitialCall: CanBeAssignedInitialCall[FemalePioneer | MalePioneer, InitialCall] = new CanBeAssignedInitialCall[FemalePioneer | MalePioneer, InitialCall] {}

given simpleMemberWhoIsAStudentCanBeAssignedInitialCall: CanBeAssignedInitialCall[SimpleFemaleMemberWhoIsAStudent | SimpleMaleMemberWhoIsAStudent, InitialCall] = new CanBeAssignedInitialCall[SimpleFemaleMemberWhoIsAStudent | SimpleMaleMemberWhoIsAStudent, InitialCall] {}

given simpleBaptizedPublisherCanBeAssignedInitialCall: CanBeAssignedInitialCall[SimpleBaptizedFemalePublisher | SimpleBaptizedMalePublisher, InitialCall] = new CanBeAssignedInitialCall[SimpleBaptizedFemalePublisher | SimpleBaptizedMalePublisher, InitialCall] {}

given unbaptizedPublisherCanBeAssignedInitialCall: CanBeAssignedInitialCall[UnbaptizedFemalePublisher | UnbaptizedMalePublisher, InitialCall] = new CanBeAssignedInitialCall[UnbaptizedFemalePublisher | UnbaptizedMalePublisher, InitialCall] {}

// return visits
trait CanBeAssignedReturnVisit[A <: Member[_, Student], B <: ApplyYourselfToFieldMinistry] {
  def assign(a: A)(using assignment: ReturnVisit): String = s"${a.firstName} ${a.lastName} can be assigned ${assignment.toString}"
}

given elderCanBeAssignedReturnVisit: CanBeAssignedReturnVisit[Elder, ReturnVisit] = new CanBeAssignedReturnVisit[Elder, ReturnVisit] {}

given ministerialServantCanBeAssignedReturnVisit: CanBeAssignedReturnVisit[MinisterialServant, ReturnVisit] = new CanBeAssignedReturnVisit[MinisterialServant, ReturnVisit] {}

given pioneerCanBeAssignedReturnVisit: CanBeAssignedReturnVisit[FemalePioneer | MalePioneer, ReturnVisit] = new CanBeAssignedReturnVisit[FemalePioneer | MalePioneer, ReturnVisit] {}

given simpleMemberWhoIsAStudentCanBeAssignedReturnVisit: CanBeAssignedReturnVisit[SimpleFemaleMemberWhoIsAStudent | SimpleMaleMemberWhoIsAStudent, ReturnVisit] = new CanBeAssignedReturnVisit[SimpleFemaleMemberWhoIsAStudent | SimpleMaleMemberWhoIsAStudent, ReturnVisit] {}

given simpleBaptizedPublisherCanBeAssignedReturnVisit: CanBeAssignedReturnVisit[SimpleBaptizedFemalePublisher | SimpleBaptizedMalePublisher, ReturnVisit] = new CanBeAssignedReturnVisit[SimpleBaptizedFemalePublisher | SimpleBaptizedMalePublisher, ReturnVisit] {}

given unbaptizedPublisherCanBeAssignedReturnVisit: CanBeAssignedReturnVisit[UnbaptizedFemalePublisher | UnbaptizedMalePublisher, ReturnVisit] = new CanBeAssignedReturnVisit[UnbaptizedFemalePublisher | UnbaptizedMalePublisher, ReturnVisit] {}

// bible studies
trait CanBeAssignedBibleStudy[A <: Member[_, Student], B <: ApplyYourselfToFieldMinistry] {
  def assign(a: A)(using assignment: BibleStudy): String = s"${a.firstName} ${a.lastName} can be assigned ${assignment.toString}"
}

given elderCanBeAssignedBibleStudy: CanBeAssignedBibleStudy[Elder, BibleStudy] = new CanBeAssignedBibleStudy[Elder, BibleStudy] {}

given ministerialServantCanBeAssignedBibleStudy: CanBeAssignedBibleStudy[MinisterialServant, BibleStudy] = new CanBeAssignedBibleStudy[MinisterialServant, BibleStudy] {}

given pioneerCanBeAssignedBibleStudy: CanBeAssignedBibleStudy[FemalePioneer | MalePioneer, BibleStudy] = new CanBeAssignedBibleStudy[FemalePioneer | MalePioneer, BibleStudy] {}

given simpleBaptizedPublisherCanBeAssignedBibleStudy: CanBeAssignedBibleStudy[SimpleBaptizedFemalePublisher | SimpleBaptizedMalePublisher, BibleStudy] = new CanBeAssignedBibleStudy[SimpleBaptizedFemalePublisher | SimpleBaptizedMalePublisher, BibleStudy] {}

// 5 minutes talks
trait CanBeAssignedFiveMinTalk[A <: Member[Male, Student], B <: ApplyYourselfToFieldMinistry] {
  def assign(a: A)(using assignment: FiveMinTalk): String = s"${a.firstName} ${a.lastName} can be assigned ${assignment.toString}"
}

given elderCanBeAssignedFiveMinTalk: CanBeAssignedFiveMinTalk[Elder, FiveMinTalk] = new CanBeAssignedFiveMinTalk[Elder, FiveMinTalk] {}

given ministerialServantCanBeAssignedFiveMinTalk: CanBeAssignedFiveMinTalk[MinisterialServant, FiveMinTalk] = new CanBeAssignedFiveMinTalk[MinisterialServant, FiveMinTalk] {}

given pioneerCanBeAssignedFiveMinTalk: CanBeAssignedFiveMinTalk[MalePioneer, FiveMinTalk] = new CanBeAssignedFiveMinTalk[MalePioneer, FiveMinTalk] {}

given simpleBaptizedPublisherCanBeAssignedFiveMinTalk: CanBeAssignedFiveMinTalk[SimpleBaptizedMalePublisher, FiveMinTalk] = new CanBeAssignedFiveMinTalk[SimpleBaptizedMalePublisher, FiveMinTalk] {}