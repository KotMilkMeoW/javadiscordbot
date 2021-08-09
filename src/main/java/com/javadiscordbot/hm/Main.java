package com.javadiscordbot.hm;
import net.dv8tion.core.AcountType;

import net.dv8tion.core.JDABuilder;

public class Main {

   public static void main(String[] args){

      JDABuilder builder = new JDABuilder(AccountType.BOT);

      String token = "тут будет токен";

      builder.setToken(token);

      builder.buildAsync();

   }

}
