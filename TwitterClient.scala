package com.feed

import twitter4j.conf.ConfigurationBuilder
import twitter4j.TwitterFactory
import twitter4j.Status
import twitter4j.StatusUpdate

object TwitterClient {
  
  def main(args:Array[String]):Unit={
    //configuration to create twitter object
    val cb=new ConfigurationBuilder
    cb.setDebugEnabled(true)
      .setOAuthConsumerKey("consumner key")
      .setOAuthConsumerSecret("consumer secret key")
      .setOAuthAccessToken("access token")
      .setOAuthAccessTokenSecret("access secret token")
    val tf=new TwitterFactory(cb.build())
    val twitter=tf.getInstance()
    
   //using the twitter object to get your home time line
        val hometimeline = twitter.getHomeTimeline
        println("Showing home timeline..........")
        val it = hometimeline.iterator
        while (it.hasNext()) {
            val hometimeline = it.next
            println(hometimeline.getUser.getName + ":" +hometimeline.getText );
        }
  }
}
