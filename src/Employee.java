public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear ;

    Employee(String name,double salary,int workHours,int hireYear)
    {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;

    }

    public double tax()
    {
        if(this.salary < 1000)
        {
            return 0;
        }
        else
        {
            return(this.salary*0.03);
        }

    }

    public double bonus()
    {
        if(this.workHours > 40)
        {
            return ((this.workHours - 40)*30);
        }
        else
        {
            return 0;
        }
    }

    public double raiseSalary()
    {
        int year = 2021 - this.hireYear;
        double raise = 0;

        if(year < 10)
        {
            raise = 0.05;
        }
        else if( year >=10 && year <20)
        {
            raise = 0.10;
        }
        else if (year >=20)
        {
            raise = 0.15;
        }

        return raise*this.salary;
    }

    public String toString()
    {
        double n1 = this.salary + this.bonus() - this.tax();
        double total = this.salary + this.bonus() - this.tax() + this.raiseSalary();

        return("Adı: " + this.name +"\n" + "Maaş: " + this.salary + "\n" + "Çalışma Saati: " + this.workHours
        + "\n" + "Başlangıç Yılı: " + this.hireYear + "\n" + "Vergi: " + this.tax() + "\n"
        + "Bonus: " + this.bonus() + "\n" + "Maaş Artışı: " + this.raiseSalary() + "\n" + "Vergi ve Bonuslar ile Birlikte Maaş: " + n1 + "\n"
        + "Toplam Maaş: " + total);

    }
}