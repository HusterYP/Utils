#include<iostream>

using namespace std;

int main()
{
    int count = 0;
    char ch;
    cin.get(ch);
    while(cin.fail() == false)
    {
        //cout<<ch;
        count++;
        cin.get(ch);
    }
    cout<<"The total count is: "<<count<<endl;
    return 0;
}
