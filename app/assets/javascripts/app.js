angular.module('myApp', [])
  .constant('PI', Math.PI)
    .controller('MyCtrl', function($scope) {
       $scope.message = 'hi mom!';
    });
