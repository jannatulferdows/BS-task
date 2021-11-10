#include <bits/stdc++.h>
using namespace std;

struct Student
{
    string FIrstName;
    int id;
    double cgpa;
};


bool compareTwoStudents(Student a, Student b)
{
    if (a.cgpa != b.cgpa)
        return a.cgpa > b.cgpa;

    if((a.FIrstName.compare(b.FIrstName)) != 0)
        return (a.FIrstName.compare(b.FIrstName)) < 0;


    return (a.id < b.id);
}


int main()
{
    int n,i;
    cin>>n;

    Student a[n];
    for(i=0; i<n; i++)
    {

        cin>>a[i].id;
        cin>>a[i].FIrstName;
        cin>>a[i].cgpa;
    }

    sort(a, a + n, compareTwoStudents);

    for (int i = 0; i < n; i++)
    {

        cout << a[i].FIrstName;
        cout << "\n";
    }

    return 0;
}
