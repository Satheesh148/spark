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
      .setOAuthConsumerKey("fuX8dn6azXkRN9WAD2ZCk6rvw")
      .setOAuthConsumerSecret("gCb1UwZesfw7Wm7h6kFJHOi0NpzXUgiDVpkihOP4Yxrdtn3aF7")
      .setOAuthAccessToken("3703772654-p2J9POhkEH4hRblOj05n6dXyCqcKN1AcH57Bnar")
      .setOAuthAccessTokenSecret("6jLyLl7tpLrBe1AxQhunBi0Gkbi2JqSJ2ILUbkWOWvMRT")
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
