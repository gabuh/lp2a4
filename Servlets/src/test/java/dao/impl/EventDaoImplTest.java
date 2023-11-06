package dao.impl;

import junit.framework.TestCase;
import model.Event;
import util.Util;

import java.util.ArrayList;
import java.util.Date;

public class EventDaoImplTest extends TestCase {

    private void createEvent(){
        Event event = new Event( new Date(), "oaksoaks");
        Event event2 = new Event(new Date(), "oaksoaks");

        new EventDaoImpl().create(event);
        new EventDaoImpl().create(event2);
    }


    public void testEmptyEvents(){

        for (int i = 0; i< 10; i++){
            System.out.println(new Date().after(Util.stringToDate("25-2-2023")));
        }

        //        createEvent();
//
//        System.out.println(
//                new EventDaoImpl().getEvents()
//        );
//
//
//        assertEquals(new ArrayList<Event>(), new EventDaoImpl().getEvents());
    }

}