class Employee extends Person {
    private String department;
    private boolean belongsToADepartment;

    public Employee(String name, String department) {
        super(name);
        this.department = department;
    }


    public String getDepartment() throws Exception {
        if (this.belongsToADepartment) {
            return this.department;
        } else {
            throw new DepartmentNotFoundException("No department found for " + this.getName());
        }
    }

    public String getDepartment() {
        return department;
    }
}
