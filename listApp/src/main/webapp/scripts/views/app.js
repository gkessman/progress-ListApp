define(['backbone'], function(Backbone) {
	var App = Backbone.View.extend({
		initialize: function() {
			console.log( 'It is working!' );
		}
	});

	return App;
});