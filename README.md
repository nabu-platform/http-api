# Why?

There are already quite a few HTTP servers so why a new one?

At first it was a challenge to myself, I had written a mime library (for mail, as2,...) and was wondering how hard it could be to write a HTTP layer on top of that. Turns out it's not that hard.

A second impulse was that I wanted to do something different than the classic servlet approach. Instead I went for an event-driven design (see below).

The last contributing factor to the custom HTTP design was the flexibility. For example the REST-based messaging solution built on top of the HTTP server does some interesting traffic rerouting to avoid unnecessary I/O, allowing really large requests (limited only by disk space) to be dropped directly into the target queue. 

## Servlet no more

The server diverges from the age-old servlet concept and uses a more event-driven approach. When a request arrives at the server, he will send the HTTPRequest up an event queue. Every handler in the queue has the capability of modifying the request (e.g. verify authentication), sending back a response (e.g. early 401 in case of failed authentication) or even rewriting the original request (e.g. internal redirect). This is obviously reminiscent of the SOAP handler stack and other such eventing solutions.

The response that is returned is then sent up the queue again to see if anyone wants to modify that. This can be used for example to prettify error pages.

## Sessions

By default the server does not have sessions, this is considered to be the responsibility of an addon. For example the glue web framework handles its own sessions.