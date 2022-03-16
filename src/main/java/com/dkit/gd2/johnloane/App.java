package com.dkit.gd2.johnloane;

import java.util.*;

/**
 * OOP CA3
 * @author John Loane
 */
public class App 
{
    ArrayList<Student> students;
    ArrayList<Employee> employees;
    Set<String> newProducts;
    Map<String,Integer> nameCount;
    Queue<Employee> employeeQueue;
    Set<String> LinkedHashSet;


    public static void main(String[] args) {
        System.out.println("CA3 Mock  Example");
        App app = new App();
        app.start();
    }

    public void start()
    {
        //Question 1

        questionOnePartA();
        questionOnePartB();
        questionOnePartC();
        questionOnePartD();

//        //Question 2
          questionTwoPartA();
          questionTwoPartB();
          questionTwoPartC();
          questionTwoPartD();
//
//        //Question 3
        List<String> oneHundredStrings = new ArrayList<>();
        populateOneHundredStrings(oneHundredStrings);

        questionThreePartA(oneHundredStrings);
        questionThreePartB();
//
//        //Question 4
        compareTwoStudents();
        questionFourPartA();
        questionFourPartB();
//        questionFourPartC();
    }

    private void questionFourPartB() {
        System.out.println("Hashcode override method has not been setup in the student class \n");
    }

    private void questionFourPartA() {
        System.out.println("The Method returns false because there is override .equals method in the student class.\n ");
    }

    private void questionThreePartB() {

        System.out.println("LinkedHashSet Time Complexity:  .add O(1)\n");
    }

    private void questionThreePartA(List<String> oneHundredStrings) {

        LinkedHashSet = new LinkedHashSet<String>();

        for (int i = 0; i < oneHundredStrings.size(); i++) {
            LinkedHashSet.add(oneHundredStrings.get(i));
        }

        System.out.println(LinkedHashSet);
    }

    private void questionTwoPartD() {
        System.out.println("Queue is best used as it keeps in order of objects add removes in order\n");

        employeeQueue = new LinkedList<Employee>();
        for (Employee employee: employees){
            employeeQueue.add(employee);
        }

        Employee next = getNextOnWaitingList(employeeQueue);


    }

    private Employee getNextOnWaitingList(Queue<Employee> employeeQueue) {

        return employeeQueue.remove();
    }

    public void printNameAndCount(Map<String,Integer> nameCount){



        for (Map.Entry<String, Integer >entry : nameCount.entrySet()){
            System.out.println("Name: " + entry.getKey() + ", Count: " + entry.getValue());
        }
    }

    private void questionTwoPartC() {

        System.out.println("Hash map is best used here because we can store the name as a key and an integer with how many employees have the same name\n");
        nameCount= new HashMap<String, Integer>();

        for (Employee employee: employees){
            Integer count = nameCount.get(employee.getFirstName());

            if (count != null){
                nameCount.put(employee.getFirstName(),(count+1));
            }else {
                nameCount.put(employee.getFirstName(),1);
            }

        }

        printNameAndCount(nameCount);




    }

    public void printUniqueNames(Set<String> uniqueNames) {

        System.out.println("\n uniqueNames:");
        Iterator<String> iterator = uniqueNames.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    private void questionTwoPartB() {
        System.out.println("Hashset set is best suited as it doesnt allow duplicates");
        newProducts = new HashSet<String>();

        for (Employee employee :employees){

            newProducts.add(employee.getFirstName());
        }

        printUniqueNames(newProducts);
    }

    private void questionTwoPartA() {

        employees = new ArrayList<>();
        employees.add(new Employee("Josh","Smith"));
        employees.add(new Employee("Emma","Bell"));
        employees.add(new Employee("Shane","McCarthy"));
        employees.add(new Employee("Joe","Bloggs"));
        employees.add(new Employee("Tom","Jones"));

        pickLuckyWinner(employees);



    }
    public void pickLuckyWinner(ArrayList<Employee> employees) {


        Random random = new Random();
        int randomNumber = random.nextInt(employees.size());

        Employee winner = employees.get(randomNumber);
        System.out.println("The Winner is : "+ winner.toString());

    }

    private void questionOnePartD() {
        System.out.println("Q1 D. ArrayList .add = O(N) .sort = O(n log n)");
    }

    private void questionOnePartC() {
        Collections.sort(students,new AgeComparator());

        System.out.println("\n");
        for (Student student : students) {
            System.out.println(student);
        }
    }


    private  void questionOnePartA() {
        students =new ArrayList<Student>();
        students.add(new Student(1,"John",20));
        students.add(new Student(2,"Bob",25));
        students.add(new Student(3,"Tom",18));
        students.add(new Student(4,"Shane",22));

    }

    private  void questionOnePartB() {
        Collections.sort(students,new NameComparetor());

        for (Student student : students) {
            System.out.println(student);
        }
    }

    //The method below relates to Question 4
    private static void compareTwoStudents()
    {
        Student alex1 = new Student(1, "Alex", 22);
        Student alex2 = new Student(1, "Alex", 22);
        System.out.println("alex1 hashcode = " + alex1.hashCode());
        System.out.println("alex2 hashcode = " + alex2.hashCode());
        System.out.println("Checking equality between alex1 and alex2 = " + alex1.equals(alex2));
    }

    //This is just a helper method to populate the list of strings for question 3. You do not need to read it to answer any of the questions in the CA
    private static void populateOneHundredStrings(List<String> oneHundredStrings)
    {
        for(int i=0; i < 100; i++)
        {
            if(i / 10 == 0)
            {
                oneHundredStrings.add("Java");
            }
            else if(i / 10 == 1)
            {
                oneHundredStrings.add("Python");
            }
            else if(i / 10 == 2)
            {
                oneHundredStrings.add("C++");
            }
            else if(i / 10 == 3)
            {
                oneHundredStrings.add("Javascript");
            }
            else if(i / 10 == 4)
            {
                oneHundredStrings.add("Ruby");
            }
            else if(i / 10 == 5)
            {
                oneHundredStrings.add("Golang");
            }
            else if(i / 10 == 6)
            {
                oneHundredStrings.add("C#");
            }
            else if(i / 10 == 7)
            {
                oneHundredStrings.add("C");
            }
            else if(i / 10 == 8)
            {
                oneHundredStrings.add("R");
            }
            else if(i / 10 == 9)
            {
                oneHundredStrings.add("Swift");
            }
        }
    }
}
