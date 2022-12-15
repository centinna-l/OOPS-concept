#include <iostream>
using namespace std;

class MyClass
{                    // The class
public:              // Access specifier
    int myNum;       // Attribute (int variable)
    string myString; // Attribute (string variable)
    MyClass(int myNum, string myString); //Constructor Declaration
    int getNumber();

private:
    int number = 5;
};

MyClass::MyClass(int myNum, string myString){
    this->myNum = myNum;
    this->myString = myString;
}

int MyClass::getNumber(){
    return this->number;
}


int main()
{

    //Instance of a class
    MyClass myObj(35,"A new Message"); 


    // Print attribute values
    cout << myObj.myNum << "\n";
    cout << myObj.myString << "\n";
    cout << myObj.getNumber() << "\n";
    return 0;
}