package com.sambeth.oclm.rules.livingaschristians

import com.sambeth.oclm.models.*

trait CanBeAssignedCongregationBibleStudy[A <: Member[Male, Student], B <: LivingAsChristians] {
  def assign(a: A)(using assignment: CongregationBibleStudy): String = s"${a.firstName} ${a.lastName} can be assigned ${assignment.toString}"
}

given elderCanBeAssignedCongregationBibleStudy: CanBeAssignedCongregationBibleStudy[Elder, CongregationBibleStudy] = new CanBeAssignedCongregationBibleStudy[Elder, CongregationBibleStudy] {}

given ministerialServantCanBeAssignedCongregationBibleStudy: CanBeAssignedCongregationBibleStudy[MinisterialServant, CongregationBibleStudy] = new CanBeAssignedCongregationBibleStudy[MinisterialServant, CongregationBibleStudy] {}


trait CanBeAssignedAdHocAssignment[A <: Member[Male, Student], B <: LivingAsChristians] {
  def assign(a: A)(using assignment: AdHoc): String = s"${a.firstName} ${a.lastName} can be assigned ${assignment.toString}"
}

given elderCanBeAssignedAdHocAssignment: CanBeAssignedAdHocAssignment[Elder, AdHoc] = new CanBeAssignedAdHocAssignment[Elder, AdHoc] {}

given ministerialServantCanBeAssignedAdHocAssignment: CanBeAssignedAdHocAssignment[MinisterialServant, AdHoc] = new CanBeAssignedAdHocAssignment[MinisterialServant, AdHoc] {}
