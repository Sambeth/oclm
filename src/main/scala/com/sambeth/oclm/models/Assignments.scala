package com.sambeth.oclm.models

trait Assignment {
  def owner: Member[_, Student]
}

case class Chairman(owner: Elder) extends Assignment
case class OpeningPrayer[M <: Member[Male, Student]](owner: M) extends Assignment
case class ClosingPrayer[M <: Member[Male, Student]](owner: M) extends Assignment

trait TreasuresFromGodsWord extends Assignment
case class TenMinutesTalk[M <: Member[Male, Student]](owner: M) extends TreasuresFromGodsWord
case class SpiritualGems[M <: Member[Male, Student]](owner: M) extends TreasuresFromGodsWord
case class BibleReading(owner: Member[Male, Student]) extends TreasuresFromGodsWord

trait ApplyYourselfToFieldMinistry extends Assignment
case class InitialCallVideo(owner: Elder) extends ApplyYourselfToFieldMinistry
case class ReturnVisitVideo(owner: Elder) extends ApplyYourselfToFieldMinistry
case class InitialCall(owner: Member[_, Student], support: Member[_, Student]) extends ApplyYourselfToFieldMinistry
case class ReturnVisit(owner: Member[_, Student], support: Member[_, Student]) extends ApplyYourselfToFieldMinistry
case class BibleStudy(owner: Member[_, Student], support: Member[_, Student]) extends ApplyYourselfToFieldMinistry
case class FiveMinutesTalk(owner: Member[Male, Student]) extends ApplyYourselfToFieldMinistry

trait LivingAsChristians extends Assignment
case class AdHoc[M <: Member[Male, Student]](title: String, owner: M) extends LivingAsChristians
case class CongregationBibleStudy(owner: Elder) extends LivingAsChristians
