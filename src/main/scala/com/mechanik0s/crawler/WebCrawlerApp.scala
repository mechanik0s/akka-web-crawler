package com.mechanik0s.crawler

import akka.actor.ActorSystem

object WebCrawlerApp extends App {
  val actors: ActorSystem = ActorSystem("web-crawler")
}
