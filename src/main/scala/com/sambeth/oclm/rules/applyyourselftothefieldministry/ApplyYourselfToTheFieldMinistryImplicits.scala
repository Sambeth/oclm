package com.sambeth.oclm.rules.applyyourselftothefieldministry

import com.sambeth.oclm.models._


object ApplyYourselfToTheFieldMinistryImplicits {
  implicit class AssignInitialCallVideo(val m: Elder) {
    def assignInitialCallVideo = InitialCallVideo(m)
  }

  implicit class AssignReturnVisitVideo(val m: Elder) {
    def assignReturnVisitVideo = ReturnVisitVideo(m)
  }

  implicit class AssignFemaleInitialCall[M <: Member[Female, Student]](val m: M) {
    def assignStudentInitialCall(support: Member[Female, Student]) = InitialCall(m, support)
  }

  implicit class AssignMaleInitialCall[M <: Member[Male, Student]](val m: M) {
    def assignStudentInitialCall(support: Member[Male, Student]) = InitialCall(m, support)
  }

  implicit class AssignFemaleReturnVisit[M <: Member[Female, Student]](val m: M) {
    def assignStudentReturnVisit(support: Member[Female, Student]) = ReturnVisit(m, support)
  }

  implicit class AssignMaleReturnVisit[M <: Member[Male, Student]](val m: M) {
    def assignStudentReturnVisit(support: Member[Male, Student]) = ReturnVisit(m, support)
  }

  implicit class AssignFemaleBibleStudy[M <: Member[Female, Student]](val m: M) {
    def assignStudentBibleStudy(support: Member[Female, Student]) = BibleStudy(m, support)
  }

  implicit class AssignMaleBibleStudy[M <: Member[Male, Student]](val m: M) {
    def assignStudentBibleStudy(support: Member[Male, Student]) = BibleStudy(m, support)
  }

  implicit class AssignFiveMinutesTalk[M <: Member[Male, Student]](val m: M) {
    def assignFiveMinutesTalk = FiveMinutesTalk(m)
  }
}
