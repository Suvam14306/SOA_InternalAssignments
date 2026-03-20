#include<iostream>
#include<Eigen/Dense>

using namespace std;
using namespace Eigen;

int main()
{
MatrixXd data(4,3);
data << 150,5,25,
        160,60,30,
        170,65,35,
        180,80,40;
        
int rows = data.rows();
int cols = data.cols();

VectorXd mean(cols);
VectorXd stddev(cols);
VectorXd minVal(cols);
VectorXd maxVal(cols);

for(int j = 0;j<cols;j++)
{
mean(j) = 0;
minVal(j) = data(0,j);
maxVal(j) = data(0,j);
}

for(int j = 0 ;j<cols;j++)
{
for(int i = 0;i<rows;i++)
{
mean(j) += data(i,j);

if(data(i,j) < minVal(j)) 
{
minVal(j) = data(i,j);
}
if(data(i,j) > maxVal(j))
 {
maxVal(j) = data(i,j);
 }
}
mean(j)/=rows;
}

for(int j =0;j<cols;j++)
{
stddev(j) = 0;
for(int i =0;i<rows;i++)
 {
stddev(j) += pow(data(i,j) - mean(j),2);
 }
stddev(j) = sqrt(stddev(j)/rows);

}
MatrixXd standard(rows,cols);
MatrixXd minmax(rows,cols);
MatrixXd meannorm(rows,cols);

for(int i = 0 ;i<rows;i++)
 {
  for(int j =0 ; j<cols;j++)
   {
   standard(i,j) = (data(i,j)-mean(j))/stddev(j);
   minmax(i,j) = (data(i,j)-minVal(j))/(maxVal(j)-minVal(j));
   meannorm(i,j) = (data(i,j)-mean(j))/(maxVal(j)-minVal(j));
   
   }
 
 }
  cout<<"Original Data"<<endl<<data<<endl<<endl;
  cout<<"Standardized Data"<<endl<<standard<<endl<<endl;
  cout<<"Min-Max Normalized Data"<<endl<<minmax<<endl<<endl;
  cout<<"Mean Normalized Data"<<endl<<meannorm<<endl<<endl;

return 0;
}
