module zoo.tours.hybrid {
	requires zoo.tours.api;
	provides zoo.tours.api.Tour with zoo.tours.hybrid.QuickTour;
	uses zoo.tours.api.Tour;
}