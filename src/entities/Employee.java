package entities;

public class Employee {

    /**atributo usado para armazenar o id dos funcionários**/
    private int id;
    /**atributo usado para armazenar o nome dos funcionários**/
    private String name;
    /**atributo usado para armazenar os salários dos funcionários**/
    private double salary;

    //CONSTRUTORES
    public Employee(){}

    public Employee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // MÉTODOS GETTERS AND SETTERS
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * @overide
     */
    public String toString(){
        return id + "," + name + "," + salary;
    }

    /**método que faz o cálculo de aumento de salário**/
    public double salaryIncrease(double salaryIncrease){
        return salary = salary + (salary * salaryIncrease);
    }
}
