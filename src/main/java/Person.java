public class Person {

    private String name;
    private int age;
    private Gender gender;
    private MaritalStatus status;
    private Address address;
    private AddressProof addressProof;
    private EmploymentProof employmentProof;

    public Person(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public static class AddressProof{

        private String documentId;
        private String documentName;

        public String getDocumentId() {
            return documentId;
        }

        public void setDocumentId(String documentId) {
            this.documentId = documentId;
        }

        public String getDocumentName() {
            return documentName;
        }

        public void setDocumentName(String documentName) {
            this.documentName = documentName;
        }

        @Override
        public String toString() {
            return "AddressProof{" +
                    "documentId='" + documentId + '\'' +
                    ", documentName='" + documentName + '\'' +
                    '}';
        }
    }

    public static class EmploymentProof{

        private String empId;
        private String companyName;
        private Address companyAddress;

        public String getEmpId() {
            return empId;
        }

        public void setEmpId(String empId) {
            this.empId = empId;
        }

        public String getCompanyName() {
            return companyName;
        }

        public void setCompanyName(String companyName) {
            this.companyName = companyName;
        }

        public Address getCompanyAddress() {
            return companyAddress;
        }

        public void setCompanyAddress(Address companyAddress) {
            this.companyAddress = companyAddress;
        }

        @Override
        public String toString() {
            return "EmploymentProof{" +
                    "empId='" + empId + '\'' +
                    ", companyName='" + companyName + '\'' +
                    ", companyAddress=" + companyAddress +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address=" + address +
                ", addressProof=" + addressProof +
                ", employmentProof=" + employmentProof +
                '}';
    }
}
