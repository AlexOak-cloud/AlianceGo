package com.example.aliancego.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WorkoutBuilder {

    public static final Random random = new Random();


      public List<Action> generateWorkout(List<Action> list1,int quantity1,
                                List<Action> list2,int quantity2,
                                List<Action> list3,int quantity3,
                                List<Action> list4,int quantity4,
                                List<Action> list5,int quantity5){
          ArrayList<Action> rtnList = new ArrayList<>();
          rtnList.addAll(build(list1,quantity1));
          rtnList.addAll(build(list2,quantity2));
          rtnList.addAll(build(list3,quantity3));
          rtnList.addAll(build(list4,quantity4));
          rtnList.addAll(build(list5,quantity5));
          return rtnList;
      }

      public List<Action>  build(List<Action> list, int quantity){
          List<Action> rtnList= new ArrayList<>();
          for (int i = 0; i < quantity; i++) {
              rtnList.add(list.get(random.nextInt(list.size()-1)));
          }
          return rtnList;
      }

}
