package com.naveen;

public class EncapsulationExample {
    //Step 1 = As I mentioned the variable name as private not able to use this in another class(EncapsulationExample)
    //Step 3 = direct ah value koduka koodathanaala set method use panna poren
    // private int age = 10;
    //    private String name = naveen;
    private int age;
    private String name;
    //Step 2 = private ah iruka variable ah access panna mudiyatha naala method mooliyama panren
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
/*Suppose naan paramater pass panra varibale name uhm mela variable ku assign panna variable
name uhm same ah irunthuchina athu naala ethu instance variable(mela assign pannathu), ethu
local variable nu kandupudika mudiyathu adha naala namba default ah getters setters method use
panna instance variable ku this. nu munnadi vanthurum actual apdi ilana namba obj ref variable
ah set kooda pass panra maari irukum adha avoid panna java ve default ah koduthutanga..
 */
    public void setAge(int a){
        age = a;
    }
    public void setName(String b){
        name = b;
    }
}
