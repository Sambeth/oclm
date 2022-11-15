package com.sambeth.oclm.rules.applyyourselftothefieldministry

import com.sambeth.oclm.models.*


trait AssignInitialCallVideo[M]:
  extension(m: M) def assignInitialCallVideo: InitialCallVideo

trait AssignReturnVisitVideo[M]:
  extension (m: M) def assignReturnVisitVideo: ReturnVisitVideo

// videos
given assignChairmanInitialCallVideo: AssignInitialCallVideo[Chairman] with
  extension(m: Chairman) def assignInitialCallVideo: InitialCallVideo = InitialCallVideo(m)

given assignChairmanReturnVisitVideo:  AssignReturnVisitVideo[Chairman] with
  extension(m: Chairman) def assignReturnVisitVideo: ReturnVisitVideo = ReturnVisitVideo(m)


// initial calls
trait AssignInitialCall[M]:
  extension (m: M) def assignInitialCall(support: M): InitialCall

given assignMaleStudentInitialCall: AssignInitialCall[Member[Male, Student]] with
  extension(m: Member[Male, Student]) def assignInitialCall(support: Member[Male, Student]): InitialCall = InitialCall(m, support)

given assignFemaleStudentInitialCall: AssignInitialCall[Member[Female, Student]] with
  extension(m: Member[Female, Student]) def assignInitialCall(support: Member[Female, Student]): InitialCall = InitialCall(m, support)


// return visits
trait AssignReturnVisit[M]:
  extension (m: M) def assignReturnVisit(support: M): ReturnVisit

given assignMaleStudentReturnVisit: AssignReturnVisit[Member[Male, Student]] with
  extension(m: Member[Male, Student]) def assignReturnVisit(support: Member[Male, Student]): ReturnVisit = ReturnVisit(m, support)

given assignFemaleStudentReturnVisit: AssignReturnVisit[Member[Female, Student]] with
  extension(m: Member[Female, Student]) def assignReturnVisit(support: Member[Female, Student]): ReturnVisit = ReturnVisit(m, support)


// bible studies
trait AssignBibleStudy[M]:
  extension (m: M) def assignBibleStudy(support: M): BibleStudy

given assignMaleStudentBibleStudy: AssignBibleStudy[Member[Male, Student]] with
  extension(m: Member[Male, Student]) def assignBibleStudy(support: Member[Male, Student]): BibleStudy = BibleStudy(m, support)

given assignFemaleStudentBibleStudy: AssignBibleStudy[Member[Female, Student]] with
  extension(m: Member[Female, Student]) def assignBibleStudy(support: Member[Female, Student]): BibleStudy = BibleStudy(m, support)

// 5 minutes talks
trait AssignFiveMinTalk[M]:
  extension (m: M) def assignFiveMinTalk: FiveMinTalk

given assignMaleStudentFiveMinTalk: AssignFiveMinTalk[Member[Male, Student]] with
  extension(m: Member[Male, Student]) def assignFiveMinTalk: FiveMinTalk = FiveMinTalk(m)