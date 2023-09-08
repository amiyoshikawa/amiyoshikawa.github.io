---
layout: essay
type: essay
title: "To Ask or Not to Ask: Changing the Way We Ask Questions"
# All dates must be YYYY-MM-DD format!
date: 2023-09-07
published: true
labels:
  - Questions
  - Answers
  - StackOverflow
---

## It’s Okay to Ask, but Let’s Be Smart About It!

For most of my academic and professional life, I’ve been a strong believer in thinking that “there's no such thing as a stupid question.” Whenever I was tasked to train others at past employers, I encouraged my trainees to ask as many questions as possible, even if they felt like it was a “dumb” question. I always believed that this was a good way to foster a welcoming environment for those who were new, and by being approachable, it would encourage people to pursue their interests. Reading Eric Raymond's [essay](http://www.catb.org/esr/faqs/smart-questions.html#writewell/), however, provided a different outlook. I often hear horror stories of "newbies" being met with arrogant, gatekeepers in the Computer Science community, but what resonated most was when Raymond mentioned in his essay that "…while it isn’t necessary to already be technically competent, it is necessary to demonstrate the kind of attitude that leads to competence." This helped shift my mindset on how I should approach asking "smart" questions in hopes of yielding helpful answers. 

## So, What's a Good Question?

In the following example, a question titled [What does "use strict" do in JavaScript, and what is the reasoning behind it?](https://stackoverflow.com/questions/1335851/what-does-use-strict-do-in-javascript-and-what-is-the-reasoning-behind-it) shows how to ask "good" questions: 

```
Recently, I ran some of my JavaScript code through Crockford's JSLint, and it gave the following error:

Problem at line 1 character 1: Missing "use strict" statement.

Doing some searching, I realized that some people add "use strict"; into their JavaScript code. Once I added the statement, the error stopped appearing. Unfortunately, Google did not reveal much of the history behind this string statement. Certainly it must have something to do with how the JavaScript is interpreted by the browser, but I have no idea what the effect would be.

So what is "use strict"; all about, what does it imply, and is it still relevant?

Do any of the current browsers respond to the "use strict"; string or is it for future use?
```
This isn't a "perfect" question, by any means, but the question is clear, and the user stated that they invested some time to figure this out on their own. They also stated that Google did not provide the answer that they were looking for. The question led to several in-depth discussions which provided sufficient answers. 

## Decoding Bad Questions

In this example, a question titled [How JS sorting the numbers?](https://stackoverflow.com/questions/72671175/how-js-sorting-the-numbers) demonstrates a few issues that constiute a "bad" question in Raymond's essay:

```
I'm learning Javascript and I faced a problem with sorting numbers I don't understand how work sorting function and I find an other way to sort the numbers but it was with list not with arrays I need explanations.

const points = [40, 100, 1, 5, 25, 10];
document.getElementById("demo1").innerHTML = points;

points.sort(function(a, b) {
  return a - b
});
document.getElementById("demo2").innerHTML = points;

document.getElementById("demo3").innerHTML = points.sort();
unsorted:
<div id="demo1"></div>
sorted:
<div id="demo2"></div>
sorted alphabetically:
<div id="demo3"></div>
```
The header, for one, is not very clear. The user mentioned that they do not understand something, but they didn't go into depth as to what they didn't understand about it.

The question is met with some confusion:

<img class="img-fluid" src="/img/reflect-on-smart-questions/stack-overflow-bad-question.jpg">

Raymond mentioned in his essay that if the user’s native language is not English, it should be specified. Otherwise, it’s hard to determine whether the lack of clarity is due to language barriers or poor grammar. In this instance, the fact that the user's question was not stated clearly led to more questions from other users. Also, there's a tone of entitlement when the user states that they "need explanations." As Raymond mentioned, courtesy should not be overlooked. 

## Conclusion

Learning to ask good questions is a skill. Asking questions may be intimidating at first, and there's no denying that the questions may be met with sarcasm or critique. When we are met with unfavorable responses, we can do one of two things: we could allow it to discourage us from asking further questions, or we could use that as an indication to put more effort into crafting better question. By simply searching for answers prior to asking them could lead to helpful results. When we ask others for help, we need to recognize that we are also asking for their time, and as we often hear, time is a valuable thing. We shouldn't take advantage of that. 
