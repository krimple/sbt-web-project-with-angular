(function() {
    'use strict';

    describe('angular spec', function() {
            beforeEach(module('myApp'));

            it('should have an app with PI', inject(function(PI) {
                expect(PI).to.be.defined();
              }));
      });
}());
