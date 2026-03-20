#include <iostream>
#include <Eigen/Dense>

using namespace std;
using namespace Eigen;

int main() {

    // Design matrix (add 1 for intercept)
    MatrixXd X(4,3);

    X << 1,1,1,
         1,2,1,
         1,1,2,
         1,2,2;

    // Output vector
    VectorXd y(4);
    y << 5,7,8,9;

    // Normal equation
    VectorXd beta = (X.transpose() * X).inverse() * X.transpose() * y;

    cout << "Beta values:\n" << beta << endl;

    return 0;
}
