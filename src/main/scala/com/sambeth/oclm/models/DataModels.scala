package com.sambeth.oclm.models

import java.util.concurrent.Flow.Publisher

enum Status:
  case Active, Inactive

trait Member {
  def firstName: String
  def lastName: String
  def otherNames: Option[String]
  def age: Option[Int]
  def status: Option[Status]
  def score: Option[Int]
  def recency: Option[Int]
  def gender: Option[String]
}

abstract case class SimpleMember(firstName: String, lastName: String) extends Member

sealed trait Publisher extends Member

abstract case class UnbaptizedPublisher(firstName: String, lastName: String) extends Publisher

trait BaptizedPublisher extends Publisher

abstract case class SimpleBaptizedPublisher(firstName: String, lastName: String) extends BaptizedPublisher
abstract case class Pioneer(firstName: String, lastName: String) extends BaptizedPublisher
abstract case class MinisterialServant(firstName: String, lastName: String) extends BaptizedPublisher
abstract case class Elder(firstName: String, lastName: String) extends BaptizedPublisher
