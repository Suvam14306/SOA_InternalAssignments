#include <iostream>
#include <Eigen/Dense>

using namespace std;
using namespace Eigen;

int main()
{
VectorXd x(5);
x<<1,2,3,4,5;
VectorXd y(5);
y<<2,4,5,4,5;
double x_mean = x.mean();
double y_mean = y.mean();
//double num = ((x.array()-x_mean)*(y.array()-y_mean)).sum();
//double num2 = ((x.array()-x_mean).square()).sum();
double num = 0;
double num2 = 0;

for(int i=0;i<5;i++)
{
num =num + (x(i)-x_mean)*(y(i)-y_mean);
num2 = num2 + (x(i)-x_mean)*(x(i)-x_mean);

}
double beta = num/num2;
double beta0 = y_mean - beta*x_mean;
cout<<"Beta1 is "<<beta<<endl;
cout<<"Beta0 is "<<beta0<<endl;

double sse = 0;
for(int i =0;i<5;i++)
{
sse = sse+ ((y(i)-(beta0+(beta*x(i))))*(y(i)-(beta0+(beta*x(i)))));
}
cout<<"SSE IS "<<sse<<endl;


return 0;
}
