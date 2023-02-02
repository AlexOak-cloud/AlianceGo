package com.example.aliancego.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WorkoutBuilder {

    public static final Random random = new Random();


      public List<Action> generateWorkout(){
          ArrayList<Action> rtnList = new ArrayList<>();
          ActionBuilder actionBuilder = new ActionBuilder();
          List<Action> list1 = actionBuilder.listWorkout1();
          List<Action> list2 = actionBuilder.listWorkout2();
          List<Action> list3 = actionBuilder.listWorkout3();
          List<Action> list4 = actionBuilder.listWorkout4();
          List<Action> list5 = actionBuilder.listWorkout5();
          rtnList.addAll(build(list1,1));
          rtnList.addAll(build(list2,2));
          rtnList.addAll(build(list3,1));
          rtnList.addAll(build(list2,2));
          rtnList.addAll(build(list4,1));
          rtnList.addAll(build(list2,2));
          rtnList.addAll(build(list5,1));
          return rtnList;
      }

      public List<String> showList(List<Action> localList){
          List<String> rtnList = new ArrayList<>();
          for(Action tmp: localList){
              rtnList.add(tmp.getName() + ": " + tmp.getTime() + " секунд");
          }
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
