function AnimalesController($scope,$http) {
    $scope.animal={};
    $scope.animal.nombre='adivina';

    $scope.mostrarAnimal = function(){
        console.log('sonido :'+$scope.sonido);
        $http.get('http://localhost:8080/animal?sonido='+$scope.sonido).
            success(function(data) {
            $scope.animal = data;
        });
    };

}
