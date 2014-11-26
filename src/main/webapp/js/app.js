function AnimalesController($scope,$http) {
    $scope.animal={};
    $scope.animal.nombre='adivina';
    $scope.audio = document.createElement('audio');


    $scope.mostrarAnimal = function(){
        console.log('sonido :'+$scope.sonido);
        $http.get('http://localhost:8080/animal?sonido='+$scope.sonido).
            success(function(data) {
            $scope.animal = data;
                $scope.audio.src = 'mp3/'+$scope.animal.nombre+'.mp3';
                $scope.audio.play();
        });
    };

}
