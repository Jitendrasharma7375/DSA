// Online C++ compiler to run C++ program online
#include <iostream>
using namespace std;
int main() {
    // Write C++ code here
    char name[20];
    cin>>name;
    cout<<name<<endl;
    int length=0;
    for(int i=0;name[i]!='\0';i++)
    {
        length++;
    }
    cout<<length<<endl;
    int s=0;
    int e=length-1;
    while(s<e)
    {
        swap(name[s++],name[e--]);
    }
    cout<<name<<endl;
    return 0;
}