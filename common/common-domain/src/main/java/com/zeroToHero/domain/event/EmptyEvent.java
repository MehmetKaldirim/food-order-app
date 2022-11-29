package com.zeroToHero.domain.event;

public final class EmptyEvent implements DomainEvent<Void> {

   // create singleton instance
   public static final EmptyEvent INSTANCE = new EmptyEvent();

   //private constructure, coz this empty event is just a marker class
   // and sharing the same instance among the different classes
   private EmptyEvent(){

   }
   @Override
   public void fire() {
   }


}
