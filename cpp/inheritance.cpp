#include <iostream>
using namespace std;

class Animal
{
private:
    string name;

public:
    Animal(string name);
    string getName();
    string message();
};

Animal::Animal(string name)
{
    this->name = name;
}

string Animal::getName()
{
    return this->name;
}

string Animal::message()
{
    return "Hello from " + this->name;
}

class Cat : public Animal
{
private:
    string name;
    int age;

public:
    Cat(string name, int age) : Animal(name)
    {
        this->age = age;
    } // Pass the values from child to parent class
    string message()
    {
        return "Child class message";
    }
};

int main()
{
    Cat myCat = {"Spider", 2};
    cout << myCat.getName() << "\n";
    cout << myCat.message() << "\n";
    cout << myCat.Animal::message() << "\n";
    return 0;
}