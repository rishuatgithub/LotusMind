/*global angular */
var app = angular.module('lotusmind', []);

app.controller('login', function ($scope, $http) {
    "use strict";
    $http({method : 'GET', url: '/assignment/all?org_id=101'}).
        success(function (response, status) {
            $scope.lo = response.data;
        })
        .error(function (response, status) {
            
    });
});

app.controller('name', function(){
    this.Name='Rishu';
    this.password='rama';
}); 


 