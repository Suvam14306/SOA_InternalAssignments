#include <iostream>
#include <Eigen/Dense>
#include <cmath>

using namespace std;
using namespace Eigen;

int main() {

    VectorXd x(5);
    x << 10, 20, 30, 40, 50;

    int n = x.size();

    double mean = 0;
    double stddev = 0;
    double minVal = x(0);
    double maxVal = x(0);

    // Compute mean, min, max
    for(int i = 0; i < n; i++) {
        mean += x(i);

        if(x(i) < minVal) minVal = x(i);
        if(x(i) > maxVal) maxVal = x(i);
    }

    mean /= n;

    // Compute standard deviation
    for(int i = 0; i < n; i++) {
        stddev += pow(x(i) - mean, 2);
    }

    stddev = sqrt(stddev / n);

    VectorXd standard(n);
    VectorXd minmax(n);
    VectorXd meannorm(n);

    // Apply normalization
    for(int i = 0; i < n; i++) {

        // Standardization
        standard(i) = (x(i) - mean) / stddev;

        // Min-Max Normalization
        minmax(i) = (x(i) - minVal) / (maxVal - minVal);

        // Mean Normalization
        meannorm(i) = (x(i) - mean) / (maxVal - minVal);
    }

    cout << "Original:\n" << x << endl << endl;

    cout << "Standardized:\n" << standard << endl << endl;

    cout << "Min-Max Normalized:\n" << minmax << endl << endl;

    cout << "Mean Normalized:\n" << meannorm << endl;

    return 0;
