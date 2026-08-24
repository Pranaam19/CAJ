package Lab3;

public class Employee {

        private String ename;
        private int eid;
        private String Desig;
        private double salary;

    Employee(String ename, int eid, String desig, double salary) {
        this.ename = ename;
        this.eid = eid;
        this.Desig = desig;
        this.salary = salary;
    }

    public  double incr() {
        salary = salary*1.1;
        return salary;
    }

    public boolean searchemployee(int eid){
        if(this.eid == eid)
            return true;
        return false;
    }



    @Override
    public String toString() {
        return "Name: "+ getEname()+"Designation:"+ getDesig()+"Salary:"+getSalary();
    }

    public int getEid() {
        return eid;
    }

    public double getSalary() {
        return salary;
    }

    public String getDesig() {
        return Desig;
    }

    public String getEname() {
        return ename;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public void setDesig(String desig) {
        Desig = desig;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
