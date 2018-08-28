package priv.shen.builder;

public class Person {
    private String name;
    private String sex;
    private int age;

    public Person(){}
    public Person(Person source){
        this.name = source.name;
        this.sex = source.sex;
        this.age = source.age;
    }

    public static class Builder{
        private Person template;

        public Builder(){
            template = new Person();
        }

        public Builder name(String name){
            template.name = name;
            return this;
        }

        public Builder sex(String sex){
            template.sex = sex;
            return this;
        }

        public Builder age(int age){
            template.age = age;
            return this;
        }

        public Person build(){
            return new Person(template);
        }

    }
}

class Client{
    public static void main(String[] args) {
        Person.Builder builder = new Person.Builder();
        Person person = builder
                .name("Marry")
                .sex("female")
                .age(23)
                .build();
    }
}
